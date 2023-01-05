package com.shop.tema3.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
@RequiredArgsConstructor
public class HomeController {


    @GetMapping()
    public String open(Model model, String error, String logout)
    {
        return "index";
    }

}
