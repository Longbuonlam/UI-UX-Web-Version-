package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {
    @GetMapping("/KPIEdu/History/Calendar")
    public String ViewCalendar(){
        return "HistoryCalendar";
    }
}
