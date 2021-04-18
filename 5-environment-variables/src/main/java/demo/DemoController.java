package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Collections.singletonMap;

@RestController
public class DemoController {
    // Create environment variable spring-boot-config-demo-value=5
    @Value("${spring-boot-config-demo-value:}")
    private String value;

    @GetMapping
    public Map<String, String> index() {
        return singletonMap("value", value);
    }
}
