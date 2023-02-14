package ir.pt.insurance.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.security.oauth2.client.token.DefaultAccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AuthorizationRestTemplateConfig {
    @Autowired
    private Dashboard dashboard;

    @Bean
    protected OAuth2ProtectedResourceDetails resource() {
        //TODO:// behi: in grant_type client_credential
        List scopes = new ArrayList<String>(1) {{
            add(dashboard.SCOPE);
        }};
        ClientCredentialsResourceDetails resource = new ClientCredentialsResourceDetails();
        resource.setAccessTokenUri(dashboard.TOKEN_URL);
        resource.setClientId(dashboard.CLIENT_ID);
        resource.setClientSecret(dashboard.CLIENT_SECRET);
        resource.setScope(scopes);
        return resource;
    }

    @Bean
    public OAuth2RestOperations restTemplate() {
        AccessTokenRequest atr = new DefaultAccessTokenRequest();
        OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(resource(), new DefaultOAuth2ClientContext(atr));
        oAuth2RestTemplate.setRequestFactory(new SimpleClientHttpRequestFactory(){{
            setOutputStreaming(false);
        }});
        return oAuth2RestTemplate;
    }
}
