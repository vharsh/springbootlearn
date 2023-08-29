package sh.har.springboot.demo.helloworld;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // inject a value from the application.properties file
    @Value("${server.name}")
    private String serverName;

    // expose / returning hello world
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!!";
    }
}
