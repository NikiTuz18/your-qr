package ru.nikituz.yourqr.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.nikituz.yourqr.services.GeneratorService;

@Controller
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainController {
    private final GeneratorService generatorService;

    @GetMapping
    public String main(){
        return "main";
    }

    @PostMapping()
    public String qr(@ModelAttribute("url") String url, Model model){
        model.addAttribute("qrcode", generatorService.generateQR(url));
        return "main";
    }
}
