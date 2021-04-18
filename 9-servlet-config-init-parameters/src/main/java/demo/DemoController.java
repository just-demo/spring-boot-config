package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.NamingException;
import java.util.Map;

import static java.util.Collections.singletonMap;

@RestController
public class DemoController {
    @Value("${demo.value:}")
    private String value;

    @Autowired
    private Environment environment; // TODO: remove

    @GetMapping
    public Map<String, String> index() {
        String v = environment.getProperty("demo.value");
        return singletonMap("value", value);
    }
}
