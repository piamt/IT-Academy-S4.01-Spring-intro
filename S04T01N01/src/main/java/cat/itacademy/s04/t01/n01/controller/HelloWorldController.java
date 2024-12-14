package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }

    @GetMapping(value = {"/HelloWorld2/{name}", "/HelloWorld2"})
    String hello2(@PathVariable(value = "name", required = false) String name) {
        return "Hola, " + (name == null ? "UNKNOWN" : name) + ". Estàs executant un projecte Maven";
    }
}
