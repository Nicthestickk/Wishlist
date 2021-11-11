package ønskeliste.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ØnskelisteController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/søgØnskeseddel")
    public String søgØnskeseddel(){
        return "søgØnskeseddel";
    }

    @GetMapping("/opretØnskeseddel")
    public String opretØnskeseddel(){
        return "opretØnskeseddel";
    }
}
