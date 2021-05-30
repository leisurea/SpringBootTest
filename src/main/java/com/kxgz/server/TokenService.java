package com.kxgz.server;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.kxgz.pojo.User;

import org.springframework.stereotype.Service;

@Service
public class TokenService {

    public String getToken(User userDo) {
        String token = "";
        token = JWT.create().withAudience(userDo.getId() + "")
                .sign(Algorithm.HMAC256(userDo.getPassword()));
        return token;
    }
}
