package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    @GetMapping("/KPIEdu/Home")
    public String Dashboard(){
        return "Dashboard";
    }

}
