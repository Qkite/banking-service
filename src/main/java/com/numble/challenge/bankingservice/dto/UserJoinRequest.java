package com.numble.challenge.bankingservice.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserJoinRequest {

    private String loginId;
    private String nickName;
    private String password;
    private String confirmPassword;

}
