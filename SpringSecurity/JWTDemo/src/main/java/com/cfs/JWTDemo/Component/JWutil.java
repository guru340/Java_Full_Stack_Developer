package com.cfs.JWTDemo.Component;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JWutil {

    private static final String SECERT_KE = "Mayank@123gbhfbgbfdgbdfgbdfgbjdfjgdsfjbgdfsbgjbsdfhgbfbgjh";
    private final Key SECRET_KEY = Keys.hmacShaKeyFor(SECERT_KE.getBytes());

    public String generatetoken(String username) {

        String Token = Jwts.builder().setSubject(username).setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis() * 1000 * 30)).signWith(SECRET_KEY).compact();
        System.out.println("Generated Token" + Token);
        return Token;
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token);
            return true;

        } catch (Exception e) {
            System.out.println("JWT Exception " + e.getMessage());
        }
        return false;
    }
}