package com.example.SpringP03.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    Map<String,String> userdata=new HashMap<>();
    @GetMapping("/public")
    public String publicMethod(){
        return "Public Method";
    }
    @PostMapping("/adduser")
    public String adduser(@RequestBody Map<String,String> data){
        userdata.put(data.get("username"),userdata.get("password"));
        return "Memory saved";
    }
}
