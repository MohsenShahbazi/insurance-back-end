//package ir.pt.insurance.config;
//
//import ir.pt.insurance.model.authentication.UserDetailModel;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Aspect
//public class UserDetailAspect {
//
//    @Around(value = "execution(public * ir.pt.insurance.service.*.*(..)) && args(userDetailModel, ..)")
//    public Object checkValidity(ProceedingJoinPoint joinPoint, UserDetailModel userDetailModel) throws Throwable {
//        UserDetailModel userDetailModel2 = new UserDetailModel();
//        OAuth2Authentication oa = (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();
//        Collection<GrantedAuthority> grantedAuthorities = oa.getAuthorities();
//        List<String> roles = new ArrayList<>(grantedAuthorities.size());
//        for (GrantedAuthority grantedAuthority : grantedAuthorities) {
//            roles.add(grantedAuthority.getAuthority());
//        }
//        userDetailModel2.setLogin(SecurityContextHolder.getContext().getAuthentication().getName());
//        userDetailModel2.setRoles(roles);
//        userDetailModel2.setFullName(SecurityContextHolder.getContext().getAuthentication().getName());
//        Object[] args = joinPoint.getArgs();
//        args[0] = userDetailModel2;
//
//        return joinPoint.proceed(args);
//    }
//}
