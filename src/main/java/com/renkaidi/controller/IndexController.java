package com.renkaidi.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @RequestMapping("/getIndex")
    public String getIndex(){
        return "nihao";
    }
}
