package ir.pt.insurance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
@Configuration
@EnableResourceServer
public class Oauth2ResourceConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    Dashboard dashboard;

    @Bean
    public ResourceServerTokenServices tokenService() {
        RemoteTokenServices remoteTokenServices = new RemoteTokenServices();
        remoteTokenServices.setClientId(dashboard.CLIENT_ID);
        remoteTokenServices.setClientSecret(dashboard.CLIENT_SECRET);
        remoteTokenServices.setCheckTokenEndpointUrl(dashboard.CHECK_TOKEN_URL);
        return remoteTokenServices;
    }

    @Override
    public void configure(final ResourceServerSecurityConfigurer config) {
        config.tokenServices(tokenService());//.resourceId(RESOURCE_ID);// .tokenServices(tokenServices());
    }

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and().authorizeRequests().antMatchers(
                "/**").permitAll()
                .and().authorizeRequests().anyRequest().authenticated();
//            .requestMatchers().antMatchers("/foos/**","/bars/**")
//            .and()
//            .authorizeRequests()
//                .antMatchers(HttpMethod.GET,"/foos/**").access("#oauth2.hasScope('foo') and #oauth2.hasScope('read')")
//                .antMatchers(HttpMethod.POST,"/foos/**").access("#oauth2.hasScope('foo') and #oauth2.hasScope('write')")
//                .antMatchers(HttpMethod.GET,"/bars/**").access("#oauth2.hasScope('bar') and #oauth2.hasScope('read')")
//                .antMatchers(HttpMethod.POST,"/bars/**").access("#oauth2.hasScope('bar') and #oauth2.hasScope('write') and hasRole('ROLE_ADMIN')")
        // @formatter:on
    }

}
