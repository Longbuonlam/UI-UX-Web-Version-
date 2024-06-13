package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
    @RequestMapping("/KPIEdu/Home")
    public String Dashboard(){
        return "Dashboard";
    }

    @GetMapping("/KPIEdu/Plan")
    public String Plan(){
        return "Plan";
    }

    @GetMapping("/KPIEdu/KPI")
    public String kpi(){
        return "kpi";
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

    @GetMapping("/KPIEdu/activities_expand_sidebar")
    public String activities_expand_sidebar(){
        return "activities_expand_sidebar";
    }

    @GetMapping("/KPIEdu/activities_deleteall")
    public String activities_deleteall(){
        return "activities_deleteall";
    }

    @GetMapping("/KPIEdu/activities_deleteall_expand_sidebar")
    public String activities_deleteall_expand_sidebar(){
        return "activities_deleteall_expand_sidebar";
    }

    @GetMapping("/KPIEdu/calendar")
    public String calendar(){
        return "calendar";
    }

    @GetMapping("/KPIEdu/calendar_3")
    public String calendar_3(){
        return "calendar_3";
    }

    @GetMapping("/KPIEdu/calendar_expand_sidebar")
    public String calendar_expand_sidebar(){
        return "calendar_expand_sidebar";
    }

}
