package demo;

import org.springframework.beans.factory.annotation.Value;

public class DemoBean {
    @Value("${demo.value12:}")
    private String value12;

    public String getValue12() {
        return value12;
    }

    public void setValue12(String value12) {
        this.value12 = value12;
    }
}
