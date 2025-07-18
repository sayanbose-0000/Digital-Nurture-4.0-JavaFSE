package com.cognizant.springjwt.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(
        AuthenticationController.class
    );

    @GetMapping("/authenticate") // Changed from /authentication to /authenticate
    public Map<String, String> authenticate(
        @RequestHeader("Authorization") String authHeader
    ) {
        LOGGER.info("Authentication start...");
        LOGGER.debug("Authorization header: {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("Authentication ends...");
        return map;
    }

    private String getUser(String authHeader) {
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String decoded = new String(decodedBytes);
        return decoded.split(":")[0];
    }

    private String generateJwt(String user) {
        return Jwts.builder()
            .setSubject(user)
            .setIssuedAt(new Date())
            .setExpiration(
                new Date(System.currentTimeMillis() + 20 * 60 * 1000)
            )
            .signWith(
                Keys.hmacShaKeyFor(
                    "mqgyVqwgeqgrqygSwgeqcqwugqrwgqewgJqWgTqKewygqTwghqwgaqtt23I2sAuyktlilflqolLeays5tt34t2yhC5hega3rt3a4c34t3e43r4vs".getBytes()
                ),
                SignatureAlgorithm.HS256
            )
            .compact();
    }
}
