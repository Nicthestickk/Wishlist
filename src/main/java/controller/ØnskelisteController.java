package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ØnskelisteController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/søgListe")
    public String søgListe(){
        return "søgListe";
    }
    @GetMapping("/opretBruger")
    public String opretBruger(){
        return "opretBruger";
    }

}
