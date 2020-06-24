package tv.codely.apps.mooc.controller.health_check;

import org.junit.jupiter.api.Test;
import tv.codely.apps.mooc.controller.ApplicationTestCase;

final class HealthCheckControllerTest extends ApplicationTestCase {

    @Test
    public void check_health_check_is_working() throws Exception {

        assertResponse("/health-check", 200, "{'status':'ok'}");
    }
}
