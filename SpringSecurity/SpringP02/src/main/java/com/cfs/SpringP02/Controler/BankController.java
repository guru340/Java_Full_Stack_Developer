package com.cfs.SpringP02.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/contact")
    public String ContactUs(){
        return "You can be contact on this number";
    }

    @GetMapping("/transfer")
    private String transfermoney(){
        return "Money Transefer Suceessfull";
    }

    @GetMapping("/admin")
    private String Admin() {
        return "Hello Admin";
    }

    @GetMapping("/about")
    public String about(){
        return "Ownwer of axis Bank";
    }


}
