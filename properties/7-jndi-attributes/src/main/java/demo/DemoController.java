package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Map;

import static java.util.Collections.singletonMap;

@RestController
public class DemoController {
    @Value("${demo.value:}")
    private String value;

    @GetMapping
    public Map<String, String> index() throws NamingException {
        String value = (String) new InitialContext().lookup("java:comp/env/demo.value");
        // TODO: should it have been evaluated with ${demo.value} ?
        return singletonMap("value", value + " - " + this.value);
    }
}
