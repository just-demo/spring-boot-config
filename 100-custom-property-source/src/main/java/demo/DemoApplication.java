package demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.MapPropertySource;

import java.util.Map;

import static java.util.Collections.singletonMap;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DemoApplication.class)
                .initializers(applicationContext -> applicationContext
                        .getEnvironment()
                        .getPropertySources()
                        .addFirst(new MapPropertySource("custom", customProperties())))
                .run(args);
    }

    private static Map<String, Object> customProperties() {
        return singletonMap("demo.value", "100");
    }
}
