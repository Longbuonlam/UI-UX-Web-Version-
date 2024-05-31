package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarController {
    @GetMapping("/KPIEdu/Calendar/Create")
    public String CreateCalendar(){
        return "CreateCalendar";
    }
}
