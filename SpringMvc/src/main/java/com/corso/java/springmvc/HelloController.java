package com.corso.java.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}

//CONTROLLER
//REQUESTMAPPING - mappatura di base
//metodo di tipo get printhello che aggiunge al model l'attributo message
//e gli viene passato il valore Hello spring.. ecc.