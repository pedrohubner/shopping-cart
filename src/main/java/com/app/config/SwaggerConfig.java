package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket shoppingCartApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
//
//    private ApiInfo metaInfo() {
//        return new ApiInfo(
//                "Shopping Cart Rest API",
//                "API Rest simulando um carrinho de compras",
//                "1.0.0",
//                "Terms of service",
//                "Pedro Hübner",
//                "Apache License Version 2.0",
//                "https://www.apache.org/license.html");
//    }
}
