package teenhealth.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/userlogin")
    public String loginPage(){
        return "login";
    }

    private String getUserLoingname(){
        String loginName=null;
        //当前认证通过的用户身份
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        //用户身份
        Object principal=authentication.getPrincipal();
        if(principal==null){
            loginName="匿名";

        }
        if(principal instanceof UserDetails){
            UserDetails userDetails=(UserDetails) principal;
            loginName=userDetails.getUsername();
        }else {
            loginName=principal.toString();
        }
        return loginName;
    }
}
