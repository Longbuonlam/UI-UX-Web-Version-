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

    @GetMapping("/KPIEdu/Plan/Create/Processing")
    public String Plan_Processing_createPlan(){
        return "Plan Processing- create plan";
    }

    @GetMapping("/KPIEdu/Plan/ViewDetail")
    public String Plan_Details_1(){
        return "Plan Details 1";
    }
    @GetMapping("/KPIEdu/Plan/AddTask")
    public String Plan_Details_2(){
        return "Plan Details 2";
    }
}
