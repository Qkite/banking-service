package com.numble.challenge.bankingservice.service;


import com.numble.challenge.bankingservice.UserRepository;
import com.numble.challenge.bankingservice.dto.UserJoinRequest;
import com.numble.challenge.bankingservice.dto.UserJoinResponse;
import com.numble.challenge.bankingservice.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserJoinResponse userJoin(UserJoinRequest userJoinRequest){
        User savedUser = userRepository.save(User.toEntity(userJoinRequest));

        return User.fromEntity(savedUser);


    }

}
