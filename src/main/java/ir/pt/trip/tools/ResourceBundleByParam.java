package ir.pt.trip.tools;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Created by ADMIN on 20/01/2016.
 */
public final class ResourceBundleByParam {
    public String getMsg(ResourceBundle resourceBundle, String msgKey, String... paramValue) {
        String msgValue = resourceBundle.getString(msgKey);
        MessageFormat messageFormat = new MessageFormat(msgValue);
        return messageFormat.format(paramValue);
    }

}
