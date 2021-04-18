package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class Config12 {
    @Bean
    public DemoBean bean12() {
        return new DemoBean();
    }
}
