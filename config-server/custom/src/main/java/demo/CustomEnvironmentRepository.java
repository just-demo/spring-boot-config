package demo;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;

import java.util.LinkedHashSet;
import java.util.Set;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonMap;
import static org.springframework.util.StringUtils.commaDelimitedListToStringArray;

public class CustomEnvironmentRepository implements EnvironmentRepository {
    @Override
    public Environment findOne(String application, String profile, String label) {
        String[] applications = commaDelimitedListToStringArray(application);
        String[] profiles = commaDelimitedListToStringArray(profile);
        Environment environment = new Environment(application, profiles, label, null, null);
        for (String app : applications) {
            for (String prof : addDefault(profiles)) {
                environment.add(propertySource(app, prof));
            }
        }
        return environment;
    }

    private String[] addDefault(String[] profiles) {
        Set<String> result = new LinkedHashSet<>(asList(profiles));
        result.add("default");
        return result.toArray(new String[0]);
    }

    private PropertySource propertySource(String application, String profile) {
        String sourceName = format("custom-%s-%s", application, profile);
        String demoValue = format("CUSTOM-%s-%s", application.toUpperCase(), profile.toUpperCase());
        return new PropertySource(sourceName, singletonMap("demo.value", demoValue));
    }
}
