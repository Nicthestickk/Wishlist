package ønskeliste.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ønskeliste.demo.model.Ønske;
import ønskeliste.demo.repository.ØnskeRepo;
import org.springframework.ui.Model;
import ønskeliste.demo.services.ØnskeService;
import java.util.List;

@Controller

public class ØnskelisteController {
    private ØnskeRepo repo;
    private ØnskeService ønskeService = new ØnskeService();

    public ØnskelisteController(){
        repo = new ØnskeRepo();
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/visØnskeseddeller")
    public String visØnskesedeller(Model model){
        List<Ønske> ønsker = ønskeService.getAllØnsker();
        model.addAttribute("Wishes", ønsker);
        return "visØnskesedeller";
    }

    @GetMapping("/opretØnskeseddel")
    public String opretØnskeseddel(){
        return "opretØnskeseddel";
    }
}
