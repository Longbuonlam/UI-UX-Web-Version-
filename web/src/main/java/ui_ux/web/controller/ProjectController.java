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

    @GetMapping("/KPIEdu/Dashboard1")
    public String Dashboard1(){
        return "Dashboard1";
    }

    @GetMapping("/KPIEdu/ResetPw")
    public String ResetPw(){
        return "ResetPw";
    }

    @GetMapping("/KPIEdu/ResetPwEnterCode")
    public String ResetPwEnterCode(){
        return "ResetPwEnterCode";
    }

    @GetMapping("/KPIEdu/ResetPwNewPw")
    public String ResetPwNewPw(){
        return "ResetPwNewPw";
    }
    
    @GetMapping("/KPIEdu/activities1")
    public String activities1(){
        return "activities1";
    }
    @GetMapping("/KPIEdu/kpi_expand_sidebar_scroll_2")
    public String kpi_expand_sidebar_scroll_2(){
        return "kpi_expand_sidebar_scroll_2";
    }
    @GetMapping("/KPIEdu/kpi_expand_sidebar_scroll_3")
    public String kpi_expand_sidebar_scroll_3(){
        return "kpi_expand_sidebar_scroll_3";
    }
    @GetMapping("/KPIEdu/messages_1")
    public String messages_1(){
        return "messages_1";
    }
    @GetMapping("/KPIEdu/messages_2")
    public String messages_2(){
        return "messages_2";
    }
    @GetMapping("/KPIEdu/messages_3")
    public String messages_3(){
        return "messages_3";
    }
    @GetMapping("/KPIEdu/messages_4")
    public String messages_4(){
        return "messages_4";
    }
    @GetMapping("/KPIEdu/setting1")
    public String setting1(){
        return "setting1";
    }
    @GetMapping("/KPIEdu/setting2")
    public String setting2(){
        return "setting2";
    }
    @GetMapping("/KPIEdu/setting3")
    public String setting3(){
        return "setting3";
    }
    @GetMapping("/KPIEdu/setting4")
    public String setting4(){
        return "setting4";
    }
}


