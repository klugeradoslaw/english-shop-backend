package pl.klugeradoslaw.backendshop.services;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import pl.klugeradoslaw.backendshop.entitites.UserRole;

import javax.crypto.SecretKey;
import java.util.Date;

public class Jwt {
    private final Claims claims;
    private final SecretKey secretKey;

    public Jwt(Claims claims, SecretKey secretKey) {
        this.claims = claims;
        this.secretKey = secretKey;
    }

    public boolean isExpired() {
        return !claims.getExpiration().after(new Date());
    }

    public Long getUserId() {
        return Long.valueOf(claims.getSubject());
    }

    public UserRole getRole() {
        return UserRole.valueOf(claims.get("role", String.class));
    }

    public String toString() {
        return Jwts.builder().claims(claims).signWith(secretKey).compact();
    }
}
