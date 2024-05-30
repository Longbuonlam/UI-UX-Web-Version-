package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {
    @GetMapping("/KPIEdu/SignUp")
    public String Signup(){
        return "FixSignup";
    }
}
