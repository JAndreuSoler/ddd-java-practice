package tv.codely.apps.mooc.controller.health_check;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HealthCheckController {

    @GetMapping("/health-check")
    public ResponseEntity index(){
        HashMap status = new HashMap<String, String>();
        status.put("status", "ok");
        return ResponseEntity.ok(status);
    }

}
