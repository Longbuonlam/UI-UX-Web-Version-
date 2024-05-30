package ui_ux.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    @GetMapping("/KPIEdu/Message/Soict")
    public String Chat(){
        return "TextToSoict";
    }
}
