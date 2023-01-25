package ir.pt.trip.tools;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by a-bagheri on 9/4/2017.
 */
@Component
public class Tools {

    public boolean isNullOrBlank(String s) {
        return (s == null || s.isEmpty());
    }

    public HttpSession getCurrentSession() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attributes.getRequest().getSession(true);
    }
}
