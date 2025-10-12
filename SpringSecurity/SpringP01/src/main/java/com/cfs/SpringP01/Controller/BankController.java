package com.cfs.SpringP01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    int bal=1000;
    @GetMapping("/bal")
    public int  getbalance(){
        return bal;
    }
    @PostMapping("/update")
    public int  updateAccount(@RequestParam String Accno, @RequestParam int num){
        return bal+num;
    }
    @GetMapping("/contact")
    public String ContactUs(){
        return "you can contac us on:123456987";
    }
}
