package tv.codely.mooc.courses.infrastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

import java.util.Optional;

class InMemoryCourseRepositoryShould {

    @Test
    void save_a_valid_course(){
        CourseRepository repository = new InMemoryCourseRepository();
        Course course = new Course("some-id", "some-name", "some-duration");

        repository.save(course);
    }

    @Test
    void serch_existing_course(){
        CourseRepository repository = new InMemoryCourseRepository();
        Course course = new Course("some-id", "some-name", "some-duration");

        repository.save(course);
        Assert.assertEquals(Optional.of(course), repository.findeById(course.getId()));
    }

    @Test
    void not_finde_a_no_existing_course(){
        CourseRepository repository = new InMemoryCourseRepository();

        Assert.assertFalse(repository.findeById("not-existing-id").isPresent());
    }

}
