package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config12/config2.properties")
public class Config2 {
    @Bean
    public DemoBean bean2() {
        return new DemoBean();
    }
}
