package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfo("Chris Apis",
                        "Le mie Api! Potrebbero tornarti utili! ( per ora Java17 e Spring 2.7.9)",
                        "2.7.9",
                        "https://en.wikipedia.org/wiki/MIT_License",
                        new Contact("Chris","http://christianoFaCose.org","christianoFaCose@gmail.com"),
                        "Mit",
                        "https://en.wikipedia.org/wiki/MIT_License",
                        Collections.emptyList())).tags(
                        new Tag("name-controller","The name controller")

                );


    }


}
