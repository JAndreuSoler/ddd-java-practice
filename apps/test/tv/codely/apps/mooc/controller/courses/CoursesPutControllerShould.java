package tv.codely.apps.mooc.controller.courses;

import org.junit.Test;
import tv.codely.apps.mooc.controller.ApplicationTestCase;

final public class CoursesPutControllerShould extends ApplicationTestCase {

    @Test
    public void create_a_valid_non_existing_course() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/courses/1aab45ba-3c7a-4344-8936-78466eca77fa",
            "{\"name\": \"The best course\", \"duration\": \"5 hours\"}",
            201
        );
    }
}
