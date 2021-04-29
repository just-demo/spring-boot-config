package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class DemoRelaxed {
    private String demoValue1;
    private String demoValue2;
    private String demoValue3;
    private String demoValue4;
    private String demoValue5;

    public String getDemoValue1() {
        return demoValue1;
    }

    public void setDemoValue1(String demoValue1) {
        this.demoValue1 = demoValue1;
    }

    public String getDemoValue2() {
        return demoValue2;
    }

    public void setDemoValue2(String demoValue2) {
        this.demoValue2 = demoValue2;
    }

    public String getDemoValue3() {
        return demoValue3;
    }

    public void setDemoValue3(String demoValue3) {
        this.demoValue3 = demoValue3;
    }

    public String getDemoValue4() {
        return demoValue4;
    }

    public void setDemoValue4(String demoValue4) {
        this.demoValue4 = demoValue4;
    }

    public String getDemoValue5() {
        return demoValue5;
    }

    public void setDemoValue5(String demoValue5) {
        this.demoValue5 = demoValue5;
    }
}
