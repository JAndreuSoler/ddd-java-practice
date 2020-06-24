package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

import static org.mockito.Mockito.*;

class CourseCreatorShould {

    @Test
    public void save_valid_course(){
        CourseRepository courseRepository = mock(CourseRepository.class);
        CourseCreator courseCreator = new CourseCreator(courseRepository);

        Course course = new Course("some-id", "some-name", "some-duration");

        courseCreator.create(course.getId(), course.getName(), course.getDuration());

        verify(courseRepository, atLeastOnce()).save(course);
    }
}
