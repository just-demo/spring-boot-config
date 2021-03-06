package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * {@link RefreshScope} is needed to make {@link Value} reloadable with /actuator/refresh
 */
@RefreshScope
@RestController
public class RefreshableConfigClientController {

    @Autowired
    private Demo demo;

    @Autowired
    private Environment environment;

    @Value("${demo.value}")
    private String value;

    @GetMapping
    public List<String> get() {
        return asList(demo.getValue(), environment.getProperty("demo.value"), value);
    }
}
