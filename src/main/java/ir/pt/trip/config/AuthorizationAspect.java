//package ir.pt.trip.config;
//
//
//import ir.pt.common.model.ActeeServiceModel;
//import ir.pt.core.BusinessException;
//import ir.pt.core.JPresent;
//import ir.pt.core.jenum.JStatus;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.http.HttpEntity;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.client.OAuth2RestOperations;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.LinkedHashMap;
//import java.util.List;
//
//
///**
// * Created by Pasha.Gharibi on 1/21/2016.
// *
// * @RequestHeader(value="Authorization") String Authorization,
// */
//@Aspect
//@EnableAspectJAutoProxy
//public class AuthorizationAspect {
//
//
//    @Autowired
//    Dashboard dashboard;
//    @Autowired
//    private OAuth2RestOperations restTemplate;
//
//    @Before(
//            "execution(public * ir.pt.trip.service.*.*(..))"
//    )
//    public void checkValidity(final JoinPoint joinPoint) throws Throwable {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//
//        String actee = makeService_key(joinPoint.getSignature().getDeclaringTypeName()
//                , joinPoint.getSignature().getName(), signature.getParameterTypes());
//        if (true)
//            return;
//        String login, clientId = "";
//        login = SecurityContextHolder.getContext().getAuthentication().getName();
//        OAuth2Authentication oa = (OAuth2Authentication)
//                SecurityContextHolder.getContext().getAuthentication();
//        clientId = oa.getOAuth2Request().getClientId();
//        Collection<GrantedAuthority> grantedAuthorities = oa.getAuthorities();
//        List<String> roles = new ArrayList<>(grantedAuthorities.size());
//        for (GrantedAuthority grantedAuthority : grantedAuthorities) {
//            roles.add(grantedAuthority.getAuthority());
//        }
//        if (!isGranted(actee, login, clientId, roles)) {
//            String acl = "Authorization Error:ACL [actee:" + actee + ", login:"
//                    + login + ", CLIENT_ID:" + clientId +
//                    ", roles:" + roles.toString() + "] Not Found";
//            System.out.println(acl);
//            throw new BusinessException("Access Denied, not enough authority! " + acl);
//        }
//    }
//
//    private boolean checkIfIsFree(String actee) {
//        List<String> exceptions = new ArrayList<>();
//        exceptions.add("ir.pt.trip.service.MenuService.getList(CredentialModel)");
//
////        if (exceptions.contains(actee))
////            return true;
////        else return false;
//        return true;
//    }
//
//    private String makeService_key(String path, String methodName, Object[] args) {
//        String result = path + "." + methodName + "(";
//        for (int i = 0; i < args.length; i++) {
//            if (i == args.length - 1)
//                result += ((Class) args[i]).getSimpleName();
//            else
//                result += ((Class) args[i]).getSimpleName() + ",";
//        }
//        result += ")";
//        return result;
//    }
//
//    public boolean isGranted(String actee, String login, String clientId, List<String> roles) {
//        if (false)
//            return true;
//        else {
//            String uri = dashboard.AUTHORIZATION_URL + dashboard.IS_GRANTING_SERVICE;
//            HttpEntity<ActeeServiceModel> request = new HttpEntity<>(new ActeeServiceModel(clientId, roles, actee, login));
//            boolean result = restTemplate.postForObject(uri, request, boolean.class);
//            return true;
//        }
//
//    }
//}
