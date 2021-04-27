package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConsumerConfiguration {
    @Bean
    @ConfigurationProperties("demo")
    DemoMethod demoMethod() {
        return new DemoMethod();
    }
}
