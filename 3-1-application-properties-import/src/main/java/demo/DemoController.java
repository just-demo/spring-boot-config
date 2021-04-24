package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonMap;

@RestController
public class DemoController {
    @Value("${demo.value1}")
    private String value1;

    @Value("${demo.value2}")
    private String value2;

    @GetMapping
    public List<String> index() {
        return asList(value1, value2);
    }
}
