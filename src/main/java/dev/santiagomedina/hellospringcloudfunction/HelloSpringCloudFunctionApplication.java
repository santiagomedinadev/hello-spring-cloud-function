package dev.santiagomedina.hellospringcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloSpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudFunctionApplication.class, args);
    }

    @Bean
    public Function<String,String> reverse() {
        return (s) -> String.valueOf(new StringBuilder(s).reverse());
    }

}
