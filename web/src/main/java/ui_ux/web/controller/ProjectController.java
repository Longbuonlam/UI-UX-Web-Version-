package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController {
    @PostMapping("/KPIEdu/Home")
    public String Dashboard(){
        return "Dashboard";
    }

    @GetMapping("/KPIEdu/Plan")
    public String Plan(){
        return "Plan";
    }

    @GetMapping("/KPIEdu/KPI")
    public String KPI(){
        return "KPI";
    }

    @GetMapping("/KPIEdu/Calendar")
    public String Calendar(){
        return "Calendar";
    }

    @GetMapping("/KPIEdu/History")
    public String History(){
        return "History";
    }

    @GetMapping("/KPIEdu/Message")
    public String Message(){
        return "Message";
    }

    @GetMapping("/KPIEdu/Setting")
    public String Setting(){
        return "Setting";
    }

}
