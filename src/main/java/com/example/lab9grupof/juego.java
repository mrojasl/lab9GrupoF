package com.example.lab9grupof;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class juego {

    @GetMapping(value = "/")
    public String login(){
        return "inicio";
    }

    @GetMapping(value = "/inicio")
    public String comenzar(){
        return "a";
    }
}
