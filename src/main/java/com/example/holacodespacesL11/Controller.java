package com.example.holacodespacesL11;

import java.lang.String;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
public class Controller{

    @GetMapping(path="/")
    public String home(){
        return "AT70867816 - Alanya Perez Frank";
    }
}