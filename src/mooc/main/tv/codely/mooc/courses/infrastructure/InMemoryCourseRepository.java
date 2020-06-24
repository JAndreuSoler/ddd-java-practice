package tv.codely.mooc.courses.infrastructure;

import org.springframework.stereotype.Service;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

import java.util.HashMap;
import java.util.Optional;

@Service
final public class InMemoryCourseRepository implements CourseRepository {

    private HashMap<String, Course> repository = new HashMap<>();

    @Override
    public void save(Course course) {
        repository.put(course.getId(), course);
    }

    @Override
    public Optional<Course> findeById(String id) {
        return Optional.ofNullable(repository.get(id));
    }
}
