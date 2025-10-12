package com.cfs.SpringP04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankController {
    @Autowired
    AccountServices sarvice;

    @GetMapping("/balance")
    public String getbalance(){
            return sarvice.getbal();
    }

    @PostMapping("/admin")
    public String closeAccount(){
        return sarvice.closeAccount();
    }

    @GetMapping("/about")
    public String about(){
        return "Hello Sir Welcome to Axis Bank";
    }
}
