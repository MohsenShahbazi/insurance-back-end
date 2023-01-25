package ir.pt.trip.tools;

import ir.pt.trip.config.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by Abbas.Jafari on 18/11/2015.
 */
@Component("resourceBoundle")
public class ResourceBoundle {

    @Autowired
    Dashboard dashboard;

    private String location = "fa";

    public ResourceBoundle() {
    }

    public ResourceBoundle(String location) {
        this.location = location;
    }

    public static String getMessagebyKey(String key) {
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", Locale.forLanguageTag("fa"));
            return resourceBundle.getString(key);
        } catch (MissingResourceException ex) {
            return ex.getMessage();
        }
    }

    public String getMessage(String key) {
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", Locale.forLanguageTag(location));
            return resourceBundle.getString(key);
        } catch (MissingResourceException ex) {
            return ex.getMessage();
        }
    }
}
