package com.cfs.SpringP04;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AccountServices {

    @PreAuthorize("isAuthenticated")
    public String getbal(){
        return "Your Account Balance is:8000000";
    }

    @PreAuthorize("hasRole('ADMIN')")
    public String closeAccount(){
        return "Account Close";
    }
}
