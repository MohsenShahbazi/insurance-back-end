package ir.pt.trip.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.ConnectionReleaseMode;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * Created by Pasha.Gharibi on 11/25/2015.
 */
@Configuration
@EnableTransactionManagement
public class PersistConfig {

    @Autowired
    private Dashboard dashboard;

    @Bean
    HikariDataSource dataSource() {
        try {
            HikariConfig config = new HikariConfig();
            config.setDriverClassName(dashboard.HIBERNATE_DRIVER_CLASS);
            config.setJdbcUrl(dashboard.HIBERNATE_JDBC_URL);
            config.setUsername(dashboard.HIBERNATE_USER);
            config.setPassword(dashboard.HIBERNATE_PASSWORD);
            config.setMaximumPoolSize(dashboard.HIBERNATE_MAX_POOL_SIZE);
            config.setMinimumIdle(dashboard.HIBERNATE_MIN_POOL_SIZE);
            config.setInitializationFailFast(false);

            return new HikariDataSource(config);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Bean
    public JpaTransactionManager jpaTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
        return transactionManager;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        entityManagerFactoryBean.setPackagesToScan(dashboard.HIBERNATE_ENTITYMANAGER_PACKAGES_TO_SCAN,
                dashboard.HIBERNATE_ENTITYMANAGER_COMMON_TO_SCAN);
        entityManagerFactoryBean.setJpaProperties(jpaHibernateProperties());
        return entityManagerFactoryBean;
    }

    private HibernateJpaVendorAdapter vendorAdaptor() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        return vendorAdapter;
    }

    private Properties jpaHibernateProperties() {
        Properties properties = new Properties();
        properties.put(dashboard.HIBERNATE_SHOW_SQL, dashboard.HIBERNATE_SHOW_SQL_VALUE);
        properties.put(dashboard.HIBERNATE_FORMAT_SQL, dashboard.HIBERNATE_SQL_FORMAT_VALUE);
        properties.put(dashboard.HIBERNATE_DIALECT, dashboard.HIBERNATE_DIALECT_VALUE);
        properties.put(dashboard.HIBERNATE_HBM2DDL_AUTO, dashboard.HIBERNATE_HBM2DDL_AUTO_VALUE);
        properties.put(dashboard.HIBERNATE_DEFAULT_SCHEMA, dashboard.HIBERNATE_DEFAULT_SCHEMA_VALUE);
        properties.put("hibernate.connection.release_mode", ConnectionReleaseMode.AFTER_TRANSACTION);
        return properties;
    }
}
