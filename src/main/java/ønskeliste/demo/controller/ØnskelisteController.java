package ønskeliste.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ØnskelisteController {

    @GetMapping("/")
    public String index(){
        return "indexs";
    }

    @GetMapping("/searchList")
    public String searchList(){
        return "searchList";
    }

    @GetMapping("/opretBruger")
    public String opretBruger(){
        return "opretBruger";
    }
}
