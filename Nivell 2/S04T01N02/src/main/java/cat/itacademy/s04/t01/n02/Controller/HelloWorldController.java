package cat.itacademy.s04.t01.n02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam (defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". you are running a project in Gradle";
    }
    @GetMapping({"/HelloWorld2","/HelloWorld2+{name}"})
    public String greeting2(@PathVariable(name = "name", required = false)String name){
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hello, " + name + ". you are running a project in Gradle";
    }
}

///Eliminar RAV(es como un antivirus) y Gemini