package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanController {
    @GetMapping("/KPIEdu/Plan/Create")
    public String CreatePlan(){
        return "CreatePlan";
    }

    @GetMapping("/KPIEdu/Plan/Calendar")
    public String ViewCalendar(){
        return "PlanCalendar";
    }
}
