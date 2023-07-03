package com.example.holacodespacesL11;

import java.lang.String;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/idat")
public class Controller{


    @GetMapping(path="/")
    public String home(){
        return "AT70867816 - Frank";
    }

    @GetMapping(path="/codigo")
    public String codigo(){
        return "AT70867816";
    }
    
    @GetMapping(path="/nombre-completo")
    public String nombres(){
        return "Alanya Perez Frank";
    }

}
}
