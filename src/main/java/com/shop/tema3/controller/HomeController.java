package com.shop.tema3.controller;


import com.shop.tema3.model.RoleEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/**")
@RequiredArgsConstructor
public class HomeController {


    @GetMapping()
    public String open(Model model, String error, String logout)
    {
        RoleEntity re=new RoleEntity();
        re.setId(12L);
        re.setName("da");
        model.addAttribute("message","sdfas");
        return "index";
    }

}
