package ir.pt.trip.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.security.oauth2.client.token.DefaultAccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by farshad on 14/11/2017.
 */
@Configuration
@EnableOAuth2Client
public class LoginRegisterRestTemplate {

    @Autowired
    Dashboard dashboard;

    @Autowired
    ApplicationContext applicationContext;

    @Bean(name = "oAuth2ProtectedResourceResourceLogin")
    protected OAuth2ProtectedResourceDetails resource() {
        ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails() {
            @Override
            public boolean isClientOnly() {
                return true;
            }
        };
        List scopes = new ArrayList<String>(1);
        scopes.add(dashboard.SCOPE);
        resource.setAccessTokenUri(dashboard.TOKEN_URL);
        resource.setClientId(dashboard.CLIENT_ID);
        resource.setClientSecret(dashboard.CLIENT_SECRET);
        resource.setGrantType(dashboard.GRANT_TYPE);
        resource.setScope(scopes);
        resource.setUsername(dashboard.AUTH_USERNAME);
        resource.setPassword(dashboard.AUTH_PASSWORD);
        return resource;
    }


    @Bean(name = "restTemplateLogin")
    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public OAuth2RestOperations restTemplate() {
        AccessTokenRequest atr = new DefaultAccessTokenRequest();
        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate((OAuth2ProtectedResourceDetails)
                applicationContext.getBean("oAuth2ProtectedResourceResourceLogin"), new DefaultOAuth2ClientContext(atr));
        return oAuth2RestTemplate;
    }
}
