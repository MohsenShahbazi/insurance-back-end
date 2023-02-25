package ir.pt.insurance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.OAuth;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.*;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConf {

    @Autowired
    Dashboard dashboard;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .forCodeGeneration(true)
                .genericModelSubstitutes(ResponseEntity.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("ir.pt.insurance.controller"))
                .paths(PathSelectors.any())
                .build().enableUrlTemplating(true);
    }


 /*   public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }*/


   /* @Bean
    public Docket api() {
        if (Boolean.parseBoolean("true")) {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build()
                    .securityContexts(Arrays.asList(securityContext())).pathMapping("/")
                    .securitySchemes(Arrays.asList(securitySchema()));
        } else
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("ir.pt.survey.resource.controller"))
                    .paths(PathSelectors.any())
                    .build();
    }*/

    /*  private OAuth securitySchema() {
        List<AuthorizationScope> scopes = Arrays.asList(new AuthorizationScope(dashboard.SCOPE, "me_to"));
        List<GrantType> grantTypes = Arrays.asList(new ResourceOwnerPasswordCredentialsGrant(dashboard.TOKEN_URL));
        return new OAuth("oauth2schema", scopes, grantTypes);
    }

    private SecurityContext securityContext() {
        return SecurityContext
                .builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.any())
                .build();
    }

    private List<SecurityReference> defaultAuth() {
        AuthorizationScope[] scopes = new AuthorizationScope[1];
        scopes[0] = new AuthorizationScope(dashboard.SCOPE, "me_to");
        return Arrays.asList(new SecurityReference("oauth2schema", scopes));
    }

    @Bean
    public SecurityConfiguration securityInfo() {
        return new SecurityConfiguration(dashboard.CLIENT_ID,
                dashboard.CLIENT_SECRET, "", "", "",
                ApiKeyVehicle.HEADER, null, "");
    }*/
}
