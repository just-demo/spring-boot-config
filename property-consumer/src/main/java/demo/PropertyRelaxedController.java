package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/relaxed")
public class PropertyRelaxedController {
    @Autowired
    private DemoRelaxed demoRelaxed;

    @Value("${demoValue1:}")
    private String value11;
    @Value("${demoValue2:}")
    private String value21;
    @Value("${demoValue3:}")
    private String value31;
    @Value("${demoValue4:}")
    private String value41;
    @Value("${demoValue5:}")
    private String value51;

    @GetMapping
    public List<Object> index() {
        return asList(
                demoRelaxed,
                value11,
                value21,
                value31,
                value41,
                value51
        );
    }
}
