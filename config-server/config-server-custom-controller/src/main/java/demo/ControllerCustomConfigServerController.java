package demo;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashSet;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonMap;

@RestController
public class ControllerCustomConfigServerController {
    // See mappings: org.springframework.cloud.config.server.resource.ResourceController
    @GetMapping({"/{application}/{profile}", "/{application}/{profile}/{label}"})
    public Environment environment(
            @PathVariable("application") String application,
            @PathVariable("profile") String profile,
            @PathVariable(value = "label", required = false) String label
    ) {
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
