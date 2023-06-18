package com.example.jwtservise2;

import com.example.jwtservise2.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtService2Application {

    public static void main(String[] args) {
        SpringApplication.run(JwtService2Application.class, args);
    }

}
