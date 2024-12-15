package sn.cisse410.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "") String name, Model model) {
        String greeting = "Bonjour, " + name;
        model.addAttribute("message", greeting);
        return "home";
    }

}
