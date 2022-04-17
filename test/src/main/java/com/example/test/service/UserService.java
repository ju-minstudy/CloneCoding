package com.example.test.service;

import com.example.test.UserDto;
import com.example.test.UserEntity;
import com.example.test.UserRepository;
import com.example.test.user.UserDto;
import com.example.test.user.UserEntity;
import com.example.test.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void signup(UserDto dto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(dto.getName());
        userEntity.setGender(dto.getName());
        userEntity.setAge(dto.getAge());

        userRepository.save(userEntity);
    }



    //수정했다 
}
