package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties
public class DemoMap {
    private Map<String, String> demo = new HashMap<>();

    public Map<String, String> getDemo() {
        return demo;
    }
}