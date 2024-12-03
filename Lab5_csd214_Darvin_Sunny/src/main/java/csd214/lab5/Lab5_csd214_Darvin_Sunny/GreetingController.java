package csd214.lab5.Lab5_csd214_Darvin_Sunny;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="Darvin", required=false, defaultValue="There! ") String name, Model model) {
        model.addAttribute("Darvin", name);
        return "greeting";
    }

}