package ir.pt.insurance.tools;//package ir.pt.travel.tools;
//
//import ir.pt.core.BusinessException;
//import ir.pt.insurance.model.request.FilterModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContext;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//
//import javax.servlet.http.HttpSession;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by farshad on 03/12/2017.
// */
//@Component
//public class UserDetail {
//
//    @Autowired
//    UserService userService;
//
//    public Object get() throws BusinessException{
//        HttpSession s = (HttpSession) RequestContextHolder
//                .currentRequestAttributes()
//                .resolveReference(RequestAttributes.REFERENCE_SESSION);
//
//        SecurityContext securityContext = (SecurityContext) s.getAttribute("SPRING_SECURITY_CONTEXT");
//
//        if (securityContext == null){
//            return null;
//        }
//
//        if (s.getAttribute("hbUserInfo" + securityContext.getAuthentication().getPrincipal()) == null) {
//            List<UserModel> userModels = userService.getUserList(new FilterModel(1, 10, new HashMap<String, Object>() {{
//                put("userName", securityContext.getAuthentication().getPrincipal());
//            }}));
//
//            if (userModels != null && userModels.size() > 0) {
//                s.setAttribute("hbUserInfo" + securityContext.getAuthentication().getPrincipal(), userModels.get(0));
//            }
//        }
//
//        return s.getAttribute("hbUserInfo" + securityContext.getAuthentication().getPrincipal());
//    }
//}
