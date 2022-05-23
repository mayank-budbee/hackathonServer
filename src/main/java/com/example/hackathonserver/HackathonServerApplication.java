package com.example.hackathonserver;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HackathonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackathonServerApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }

//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
//        dataSourceBuilder.url("jdbc:mysql://localhost:3306/mayank");
//        dataSourceBuilder.username("root");
//        dataSourceBuilder.password("mkUKaFbsu_iKjyHvpfmaxU32");
//        return dataSourceBuilder.build();
//    }


}
