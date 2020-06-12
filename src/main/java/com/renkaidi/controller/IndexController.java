package com.renkaidi.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @RequestMapping("/getIndex")
    public String getIndex(){
        System.out.println("第二个分支上面的提交代码");
        return "nihao";
    }
}
