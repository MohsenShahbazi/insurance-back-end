package ir.pt.trip.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Pasha.Gharibi on 11/24/2015.
 */
@Configuration
@PropertySource("classpath:application.properties")
public class Dashboard {

    ///////////////////////////// APP CONFIG ////////////////////////////
    public String LANGUAGE;
    public String INTERNAL_SERVER_ERROR_KEY;

    /////////////////////// authentication /////////////////////////////
    public String AUTHORIZATION_URL;
    public String AUTHENTICATION_URL;
    public String IS_GRANTING_SERVICE;
    public String MENU_LIST_URL;
    public String TOKEN_URL;
    public String CHECK_TOKEN_URL;
    public String LOGIN_URL;
    public String CLIENT_ID;
    public String CLIENT_SECRET;
    public String SCOPE;
    public String USERNAME;
    public String PASSWORD;
    public String AUTH_USERNAME;
    public String AUTH_PASSWORD;
    public String GRANT_TYPE;

    ////////////////////// Oracle database cofiguration ///////////////////////
    public String HIBERNATE_DIALECT;
    public String HIBERNATE_DIALECT_VALUE;
    public String HIBERNATE_SHOW_SQL;
    public String HIBERNATE_FORMAT_SQL;
    public String HIBERNATE_SHOW_SQL_VALUE;
    public String HIBERNATE_SQL_FORMAT_VALUE;
    public String HIBERNATE_ENTITYMANAGER_PACKAGES_TO_SCAN;
    public String HIBERNATE_ENTITYMANAGER_COMMON_TO_SCAN;
    public String HIBERNATE_ENTITYMANAGER_CORE_TO_SCAN;
    public String HIBERNATE_HBM2DDL_AUTO;
    public String HIBERNATE_DEFAULT_SCHEMA;
    public Integer HIBERNATE_MAX_POOL_SIZE;
    public Integer HIBERNATE_MAX_STATEMENTS;
    public Integer HIBERNATE_MIN_POOL_SIZE;
    public String HIBERNATE_HBM2DDL_AUTO_VALUE;
    public String HIBERNATE_DEFAULT_SCHEMA_VALUE;
    public String HIBERNATE_DRIVER_CLASS;
    public String HIBERNATE_USER;
    public String HIBERNATE_PASSWORD;
    public String HIBERNATE_JDBC_URL;
    public String SMSONLINE_GW_URL;
    public String BASE_INFO_URL;
    public String PORTAL_COMMON_URL;
    public String ADOTEL_URL;
    public String ADMINUSERCREDENTIALS;
    public String ADOTEL_LOGIN_EMAIL;
    public String ADOTEL_LOGIN_PASSWORD;
    public String X_API_KEY;
    public String PORTAL_URL;
    public String ENCRYPT_URL;
    public String GSM_URL;
    public String GSM_USERNAME;
    public String GSM_PASSWORD;
    public long SYSTEM_ID;
    public String SYNCH_URL;
}



