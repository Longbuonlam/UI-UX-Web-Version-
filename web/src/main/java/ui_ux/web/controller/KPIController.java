package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KPIController {
    @GetMapping("/KPIEdu/KPI/ViewSideBar")
    public String ViewSideBar(){
        return "KpiViewSideBar";
    }
}
