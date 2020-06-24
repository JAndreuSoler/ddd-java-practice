package tv.codely.apps.mooc.controller.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
final public class UserPutController {

    @PutMapping("/user/{id}")
    public ResponseEntity createUser(@PathVariable String id, @RequestBody Request r ){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
