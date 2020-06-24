package tv.codely.apps.mooc.controller.user;

import org.junit.jupiter.api.Test;
import tv.codely.apps.mooc.controller.ApplicationTestCase;

class UserPutControllerShould extends ApplicationTestCase {

    @Test
    public void create_valid_not_existing_user() throws Exception{
        assertRequestWithBody(
            "PUT",
            "/user/1aab45ba-3c7a-4344-8936-78466eca77fa",
            "{\"name\": \"some-name\", \"email\": \"some-email\", \"password\": \"some-password\"}",
            201
        );
    }
}
