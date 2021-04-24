package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomEnvironmentConfiguration {
    /**
     * It must be defined as @Bean, while annotating CustomEnvironmentRepositoryFactory with @Component would not work
     */
    @Bean
    public CustomEnvironmentRepositoryFactory customEnvironmentRepositoryFactory() {
        return new CustomEnvironmentRepositoryFactory();
    }
}
