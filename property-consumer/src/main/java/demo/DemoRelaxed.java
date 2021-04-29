package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class DemoRelaxed {
    private String relaxedValue1;
    private String relaxedValue2;
    private String relaxedValue3;
    private String relaxedValue4;
    private String relaxedValue5;
    private String relaxedValue6;

    public String getRelaxedValue1() {
        return relaxedValue1;
    }

    public void setRelaxedValue1(String relaxedValue1) {
        this.relaxedValue1 = relaxedValue1;
    }

    public String getRelaxedValue2() {
        return relaxedValue2;
    }

    public void setRelaxedValue2(String relaxedValue2) {
        this.relaxedValue2 = relaxedValue2;
    }

    public String getRelaxedValue3() {
        return relaxedValue3;
    }

    public void setRelaxedValue3(String relaxedValue3) {
        this.relaxedValue3 = relaxedValue3;
    }

    public String getRelaxedValue4() {
        return relaxedValue4;
    }

    public void setRelaxedValue4(String relaxedValue4) {
        this.relaxedValue4 = relaxedValue4;
    }

    public String getRelaxedValue5() {
        return relaxedValue5;
    }

    public void setRelaxedValue5(String relaxedValue5) {
        this.relaxedValue5 = relaxedValue5;
    }

    public String getRelaxedValue6() {
        return relaxedValue6;
    }

    public void setRelaxedValue6(String relaxedValue6) {
        this.relaxedValue6 = relaxedValue6;
    }
}
