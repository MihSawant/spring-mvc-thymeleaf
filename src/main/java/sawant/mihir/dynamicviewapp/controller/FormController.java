package sawant.mihir.dynamicviewapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sawant.mihir.dynamicviewapp.model.Avenger;
import sawant.mihir.dynamicviewapp.service.AvengerService;


@Controller
public record FormController(AvengerService avengerService)
{

    @GetMapping("/avengers")
    public String getData(Model page){
        var avengers = avengerService.findAllAvengers();
        page.addAttribute("avengers", avengers);
        return "form";
    }


    @PostMapping("/avengers")
    public String postData(@RequestParam String characterName,
                           @RequestParam String actorName, Model page){

        Avenger avenger = new Avenger(characterName, actorName);
        avengerService.addAvenger(avenger);

        page.addAttribute("avengers", avengerService.findAllAvengers());
        return "form";
    }

}
