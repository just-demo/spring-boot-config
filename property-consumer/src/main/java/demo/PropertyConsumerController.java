package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class PropertyConsumerController {
    @Autowired
    private DemoPrefix demoPrefix;

    @Autowired
    private DemoNoPrefix demoNoPrefix;

    @Autowired
    private DemoMap demoMap;

    @Autowired
    private DemoMethod demoMethod;

    @Autowired
    private Environment environment;

    @Value("${demo.value}")
    private String value;


    @GetMapping
    public List<Object> index() {
        return asList(
                demoPrefix,
                demoNoPrefix,
                demoMap,
                demoMethod,
                environment.getProperty("demo.value"),
                value);
    }
}
