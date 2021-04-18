package demo;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.context.annotation.Bean;

import static org.apache.naming.factory.Constants.FACTORY;

@SpringBootApplication
public class DemoApplication {
    @Bean
    public TomcatServletWebServerFactory tomcatServletWebServerFactory() {
        return new TomcatServletWebServerFactory() {
            @Override
            protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
                tomcat.enableNaming();
                return super.getTomcatWebServer(tomcat);
            }

            @Override
            protected void postProcessContext(Context context) {
                ContextResource resource = new ContextResource();
                resource.setName("demo.value");
                resource.setType(String.class.getName());
                resource.setProperty("content", "7");
                resource.setProperty(FACTORY, StringFactory.class.getName());
                context.getNamingResources().addResource(resource);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
