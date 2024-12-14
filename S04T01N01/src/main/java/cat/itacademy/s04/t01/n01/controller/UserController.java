package cat.itacademy.s04.t01.n01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/user")
    public Object user() {
        int calc = 10 / 0;
        System.out.println(calc);
        return ResponseEntity.status(HttpStatus.OK);

    }
}
