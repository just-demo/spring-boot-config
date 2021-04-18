package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigPropertiesApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigPropertiesApplication.class, args);
	}

	@Bean
	public DemoBean bean0() {
		return new DemoBean();
	}
}
