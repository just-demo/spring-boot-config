package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config12/config1.properties")
public class Config1 {
    @Bean
    public DemoBean bean1() {
        return new DemoBean();
    }
}
