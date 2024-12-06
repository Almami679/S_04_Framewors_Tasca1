package cat.itacademy.s04.t01.n01.S04T01N01.HelloWorldController;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam (defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". you are running a project in Maven";
    }
    @GetMapping({"/HelloWorld2","/HelloWorld2+{name}"})
    public String greeting2(@PathVariable(name = "name", required = false)String name){
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hello, " + name + ". you are running a project in Maven";
    }

}

///https://www.youtube.com/watch?v=5YbrXQIoNa0&ab_channel=CesarAugustoGuerreroMateus
///https://www.arquitecturajava.com/requestparam-spring-mvc-y-sus-opciones/