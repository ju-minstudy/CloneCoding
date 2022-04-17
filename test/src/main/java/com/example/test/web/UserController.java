package com.example.test.web;

import com.example.test.service.UserService;
import com.example.test.user.UserDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    @GetMapping()
    public String getUser(Model model) {
        UserDto dto = new UserDto();
        dto.setName("Kim");
        dto.setGender("M");

        model.addAttribute("userDto", dto);
        return "profile";
    }


    @PostMapping("/signup")
    public String postUser(UserDto dto){
        userService.signup(dto);
        return "home";
    }
}
