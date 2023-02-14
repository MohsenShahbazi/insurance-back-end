package ir.pt.insurance.config;

import ir.pt.core.JPresent;
import ir.pt.core.bundles.JMessageInterpolator;
import ir.pt.core.bundles.JResourceBundleLocator;
import ir.pt.core.jvalidation.JRestErrorHandler;
import ir.pt.util.Crypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private ResourceLoader resourceLoader;

    @Bean(name = "resourceBundle")
    public ResourceBundle resourceBundle() {
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("fa"));
            return resourceBundle;
        } catch (MissingResourceException ex) {
            ex.getMessage();
            return null;
        }
    }

    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Bean(name = "dashboard")
    Dashboard dashboard() {
        Map<String, String> resourceMap = new HashMap();
        Resource resource = resourceLoader.getResource("classpath:config.txt");
        try {
            InputStream is = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.equals("")) {
                    String a[] = line.split("=", 2);
                    resourceMap.put(a[0], a[1]);
                }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Crypto cryptoUtil = new Crypto();
        try {
            cryptoUtil.SetPassword("reportgenerator");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Dashboard dashboard = new Dashboard();
        dashboard.LANGUAGE = cryptoUtil.decrypt(resourceMap.get("LANGUAGE"));
        dashboard.CLIENT_ID = cryptoUtil.decrypt(resourceMap.get("CLIENT_ID"));
        dashboard.CLIENT_SECRET = cryptoUtil.decrypt(resourceMap.get("CLIENT_SECRET"));
        dashboard.PASSWORD = cryptoUtil.decrypt(resourceMap.get("PASSWORD"));
        dashboard.GRANT_TYPE = cryptoUtil.decrypt(resourceMap.get("GRANT_TYPE"));
        dashboard.CHECK_TOKEN_URL = cryptoUtil.decrypt(resourceMap.get("CHECK_TOKEN_URL"));
        dashboard.HIBERNATE_DEFAULT_SCHEMA = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DEFAULT_SCHEMA"));
        dashboard.HIBERNATE_DIALECT = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DIALECT"));
        dashboard.HIBERNATE_DIALECT_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DIALECT_VALUE"));
        dashboard.HIBERNATE_DRIVER_CLASS = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DRIVER_CLASS"));
        dashboard.HIBERNATE_ENTITYMANAGER_CORE_TO_SCAN = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_ENTITYMANAGER_CORE_TO_SCAN"));
        dashboard.HIBERNATE_ENTITYMANAGER_COMMON_TO_SCAN = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_ENTITYMANAGER_COMMON_TO_SCAN"));
        dashboard.HIBERNATE_ENTITYMANAGER_PACKAGES_TO_SCAN = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_ENTITYMANAGER_PACKAGES_TO_SCAN"));
        dashboard.HIBERNATE_FORMAT_SQL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_FORMAT_SQL"));
        dashboard.HIBERNATE_HBM2DDL_AUTO = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_HBM2DDL_AUTO"));
        dashboard.HIBERNATE_HBM2DDL_AUTO_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_HBM2DDL_AUTO_VALUE"));
        dashboard.HIBERNATE_JDBC_URL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_JDBC_URL"));
        dashboard.HIBERNATE_MAX_STATEMENTS = Integer.parseInt(cryptoUtil.decrypt(resourceMap.get("HIBERNATE_MAX_STATEMENTS")));
        dashboard.HIBERNATE_MAX_POOL_SIZE = Integer.parseInt(cryptoUtil.decrypt(resourceMap.get("HIBERNATE_MAX_POOL_SIZE")));
        dashboard.HIBERNATE_MIN_POOL_SIZE = Integer.parseInt(cryptoUtil.decrypt(resourceMap.get("HIBERNATE_MIN_POOL_SIZE")));
        dashboard.HIBERNATE_SHOW_SQL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_SHOW_SQL"));
        dashboard.HIBERNATE_USER = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_USER"));
        dashboard.HIBERNATE_SQL_FORMAT_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_SQL_FORMAT_VALUE"));
        dashboard.HIBERNATE_PASSWORD = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_PASSWORD"));
        dashboard.HIBERNATE_JDBC_URL = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_JDBC_URL"));
        dashboard.INTERNAL_SERVER_ERROR_KEY = cryptoUtil.decrypt(resourceMap.get("INTERNAL_SERVER_ERROR_KEY"));
        dashboard.USERNAME = cryptoUtil.decrypt(resourceMap.get("USERNAME"));
        dashboard.AUTH_USERNAME = cryptoUtil.decrypt(resourceMap.get("AUTH_USERNAME"));
        dashboard.AUTH_PASSWORD = cryptoUtil.decrypt(resourceMap.get("AUTH_PASSWORD"));
        dashboard.AUTHORIZATION_URL = cryptoUtil.decrypt(resourceMap.get("AUTHORIZATION_URL"));
        dashboard.AUTHENTICATION_URL = cryptoUtil.decrypt(resourceMap.get("AUTHENTICATION_URL"));
        dashboard.TOKEN_URL = cryptoUtil.decrypt(resourceMap.get("TOKEN_URL"));
        dashboard.IS_GRANTING_SERVICE = cryptoUtil.decrypt(resourceMap.get("IS_GRANTING_SERVICE"));
        dashboard.MENU_LIST_URL = cryptoUtil.decrypt(resourceMap.get("MENU_LIST_URL"));
        dashboard.SCOPE = cryptoUtil.decrypt(resourceMap.get("SCOPE"));
        dashboard.HIBERNATE_SHOW_SQL_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_SHOW_SQL_VALUE"));
        dashboard.HIBERNATE_DEFAULT_SCHEMA_VALUE = cryptoUtil.decrypt(resourceMap.get("HIBERNATE_DEFAULT_SCHEMA_VALUE"));
        dashboard.BASE_INFO_URL = cryptoUtil.decrypt(resourceMap.get("BASE_INFO_URL"));
        dashboard.PORTAL_URL = cryptoUtil.decrypt(resourceMap.get("PORTAL_URL"));
        dashboard.PORTAL_COMMON_URL = cryptoUtil.decrypt(resourceMap.get("PORTAL_COMMON_URL"));
        dashboard.ENCRYPT_URL = cryptoUtil.decrypt(resourceMap.get("ENCRYPT_URL"));
        dashboard.GSM_URL = cryptoUtil.decrypt(resourceMap.get("GSM_URL"));
        dashboard.GSM_USERNAME = cryptoUtil.decrypt(resourceMap.get("GSM_USERNAME"));
        dashboard.GSM_PASSWORD = cryptoUtil.decrypt(resourceMap.get("GSM_PASSWORD"));

        dashboard.ADOTEL_URL = cryptoUtil.decrypt(resourceMap.get("ADOTEL_URL"));
        dashboard.ADMINUSERCREDENTIALS = cryptoUtil.decrypt(resourceMap.get("ADMINUSERCREDENTIALS"));
        dashboard.ADOTEL_LOGIN_EMAIL = cryptoUtil.decrypt(resourceMap.get("ADOTEL_LOGIN_EMAIL"));
        dashboard.ADOTEL_LOGIN_PASSWORD = cryptoUtil.decrypt(resourceMap.get("ADOTEL_LOGIN_PASSWORD"));
        dashboard.X_API_KEY = cryptoUtil.decrypt(resourceMap.get("X_API_KEY"));

        return dashboard;
    }

    @Bean
    public JMessageInterpolator messageInterpolator() {
        return new JMessageInterpolator(new JResourceBundleLocator(resourceBundle()), new Locale("fa"));
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setMessageInterpolator(messageInterpolator());
        return validator;
    }

    @Override
    public org.springframework.validation.Validator getValidator() {
        return validator();
    }

    @Bean
    Locale locale() {
        return new Locale(dashboard().LANGUAGE, new Locale("fa").getCountry());
    }

    @Bean
    JRestErrorHandler jRestErrorHandler() {
        return new JRestErrorHandler(messageInterpolator(), locale());
    }

    @Bean()
    public JPresent jPresent() {
        return new JPresent(messageInterpolator(), locale());
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Bean(name = "multipartResolver")
    public org.springframework.web.multipart.commons.CommonsMultipartResolver commonsMultipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(10485760);
        return commonsMultipartResolver;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        List<MediaType> jsonTypes = new ArrayList<>(jsonConverter.getSupportedMediaTypes());
        jsonTypes.add(MediaType.APPLICATION_JSON_UTF8);
        jsonTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
        jsonTypes.add(MediaType.MULTIPART_FORM_DATA);
        jsonTypes.add(MediaType.ALL);
        jsonConverter.setSupportedMediaTypes(jsonTypes);
        converters.add(jsonConverter);

        FormHttpMessageConverter converter = new FormHttpMessageConverter();
        MediaType mediaType = new MediaType("application", "x-www-form-urlencoded",
                Charset.forName("UTF-8"));
        converter.setSupportedMediaTypes(Collections.singletonList(mediaType));
        converters.add(converter);

        super.configureMessageConverters(converters);
    }
}
