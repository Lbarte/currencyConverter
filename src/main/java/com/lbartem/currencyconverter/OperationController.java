package com.lbartem.currencyconverter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OperationController {

    @GetMapping("/index")
    public String greetingForm(Model model) {
        model.addAttribute("index", new Operation());
        return "index";
    }

    @PostMapping("/index")
    public String greetingSubmit(@ModelAttribute Operation greeting, Model model) {
        model.addAttribute("index", greeting);
        return "index";
    }
}
