package tv.codely.mooc.courses.application.create;

import org.springframework.stereotype.Service;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

@Service
final public class CourseCreator {

    private CourseRepository courseRepository;

    public CourseCreator(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void create(String id, String name, String duration){
        Course course = new Course(id, name, duration);
        courseRepository.save(course);
    }
}
