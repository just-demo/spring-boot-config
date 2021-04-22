package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class RootPropertyPathHolder {
    private String nodots;
    private Demo demo;

    public String getNodots() {
        return nodots;
    }

    public void setNodots(String nodots) {
        this.nodots = nodots;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public static class Demo {
        String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
