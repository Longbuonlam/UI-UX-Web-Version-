package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/KPIEdu/Dashboard1")
    public String Dashboard1(){
        return "Dashboard1";
    }

}
