package demo;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.LinkedHashSet;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonMap;

public class CustomEnvironmentRepository implements EnvironmentRepository {
    @Override
    public Environment findOne(String application, String profile, String label) {
        Environment environment = new Environment(application, new String[]{profile}, label, null, null);
        new LinkedHashSet<>(asList(profile, "default"))
                .stream()
                .map(this::propertySource)
                .forEach(environment::add);
        return environment;
    }

    private PropertySource propertySource(String profile) {
        return new PropertySource("custom-" + profile, singletonMap("demo.value", "CUSTOM-" + profile.toUpperCase()));
    }
}
