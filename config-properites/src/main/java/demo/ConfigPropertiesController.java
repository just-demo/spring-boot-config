package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class ConfigPropertiesController {

    @Autowired
    private Config config;

    @Autowired
    private Environment environment;

    @Value("${demo.value}")
    private String value;

    @Autowired
    private DemoBean bean0;

    @Autowired
    private DemoBean bean1;

    @Autowired
    private DemoBean bean2;

    @Autowired
    private DemoBean bean12;

    @GetMapping("beans")
    public List<Object> beans() {
        return asList(
                bean0, bean1, bean2, bean12,
                environment.getProperty("demo.value12"));
    }

    @GetMapping
    public List<String> get() {
        return asList(config.getValue(), environment.getProperty("demo.value"), value);
    }
}
