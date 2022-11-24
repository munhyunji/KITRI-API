package com.wemagine.basic.wemagine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

 //http://localhost:8000/swagger-ui.html


@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {
	
    private static final String API_NAME = "Wemagines 업무효율향상을 위한 RESTFUL API";
    private static final String API_VERSION = "0.0.1";
    private static final String API_DESCRIPTION = "WemagineSoft API";

    @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {

    	 registry.addResourceHandler("swagger-ui.html")
         .addResourceLocations("classpath:/META-INF/resources/");
    	 registry.addResourceHandler("/webjars/**")
         .addResourceLocations("classpath:/META-INF/resources/webjars/");
    	
    }
    
    @Bean
    public Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select() 
 	 .apis(RequestHandlerSelectors.basePackage("com.wemagine.basic.wemagine"))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.ant("/test/**")) 스웨거 html 페이지에 특정 api만 보여주고 싶다면 해당 부분 설정
                .build(); }

    public ApiInfo apiInfo() {  
        return new ApiInfoBuilder()
                .title(API_NAME)
                .version(API_VERSION)
                .description(API_DESCRIPTION)
                .build();
    }

    
    
    
	
}
