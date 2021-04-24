package demo;

import org.springframework.cloud.config.server.support.EnvironmentRepositoryProperties;

public class CustomEnvironmentProperties implements EnvironmentRepositoryProperties {
    @Override
    public void setOrder(int order) {

    }
}
