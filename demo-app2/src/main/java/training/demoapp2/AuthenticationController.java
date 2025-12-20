package training.demoapp2;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthenticationController {

    @GetMapping("/me")
    @ResponseBody
    public Authentication me(Authentication auth) {
        return auth;
    }
}