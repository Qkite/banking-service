package com.numble.challenge.bankingservice.entity;


import com.numble.challenge.bankingservice.dto.UserJoinRequest;
import com.numble.challenge.bankingservice.dto.UserJoinResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loginId;
    private String nickName;
    private String encodedPassword;


    public static User toEntity(UserJoinRequest userJoinRequest){

        return User.builder()
                .loginId(userJoinRequest.getLoginId())
                .nickName(userJoinRequest.getNickName())
                .encodedPassword(userJoinRequest.getPassword())
                .build();
    }

    public static UserJoinResponse fromEntity(User user){
        return UserJoinResponse.builder()
                .loginId(user.loginId)
                .nickName(user.nickName).build();
    }

}
