package sh.har.springboot.demo.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // expose / returning hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!";
    }
}
