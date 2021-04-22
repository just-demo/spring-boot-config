package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class RootPropertyPathHolder {
    private String nodots;
    private Spring spring;

    public String getNodots() {
        return nodots;
    }

    public void setNodots(String nodots) {
        this.nodots = nodots;
    }

    public Spring getSpring() {
        return spring;
    }

    public void setSpring(Spring spring) {
        this.spring = spring;
    }

    public static class Spring {
        Application application;

        public Application getApplication() {
            return application;
        }

        public void setApplication(Application application) {
            this.application = application;
        }
    }

    public static class Application {
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
