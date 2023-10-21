package ru.nikituz.yourqr.configurers.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Getter
@Setter
public class DataSourceProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
