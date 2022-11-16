package com.example.lab9grupof;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class juego {

    @GetMapping(value = "/")
    public String login(){
        return "inicio.html";
    }


    @RequestMapping(value="/inicio")
    @ResponseBody
    public Object update(HttpServletRequest request) {

        String name = request.getParameter("username");

        return "a";
    }
    }
