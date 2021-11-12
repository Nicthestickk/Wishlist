package ønskeliste.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ønskeliste.demo.repository.ØnskeRepo;
import org.springframework.ui.Model;

@Controller
public class ØnskelisteController {
    private ØnskeRepo repo;

    public ØnskeController(){
        repo = new ØnskeRepo();
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/visØnskeseddeller")
    public String visØnskeseddeller(Model model){
        model.addAttribute("ønsker", repo.getAllØnsker());
        return "visØnskeseddeller";
    }

    @GetMapping("/opretØnskeseddel")
    public String opretØnskeseddel(){
        return "opretØnskeseddel";
    }
}
