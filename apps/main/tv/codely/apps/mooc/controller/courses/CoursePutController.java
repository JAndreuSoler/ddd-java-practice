package tv.codely.apps.mooc.controller.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.courses.application.create.CourseCreator;

@RestController
final public class CoursePutController {

    private final CourseCreator courseCreator;

    @Autowired
    public CoursePutController(CourseCreator courseCreator) {
        this.courseCreator = courseCreator;
    }


    @PutMapping("/courses/{id}")
    public ResponseEntity create(@PathVariable String id, @RequestBody Request r){
        courseCreator.create(id, r.getName(), r.getDuration());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
