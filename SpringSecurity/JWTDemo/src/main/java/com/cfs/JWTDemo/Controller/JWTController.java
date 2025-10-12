package com.cfs.JWTDemo.Controller;

import com.cfs.JWTDemo.Component.JWutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class JWTController {

    @Autowired
    private JWutil jWutil;

    @PostMapping("/generate-token")
    public String GenerateToken(@RequestParam String username,@RequestParam String password){
        if ("admin".equals(username) && "admin".equals(password)){
//                generate
            return jWutil.generatetoken(username);


        }
        else{
            return "Invalid credentials";
        }
    }

    @GetMapping("/fund")
    public String fundtransfer(@RequestHeader(value = "Authorization",required = false)String authorizationHeader){
        if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer ")){
            String token=authorizationHeader.substring(7);

            if (jWutil.validateToken(token)){
                return "This is Secured API,token valid";
            }
            else{
                return "Invalid Token";
            }
        }else{
            return "Authorization Header is missing";
        }

    }
}
