package com.hd3vc0.vulnerable1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {

    @RequestMapping("/")
    public String helloWorld(){
        return "Mi API segura";
    }
}
