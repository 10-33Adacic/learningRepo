package com.learning.regform.controller;

import com.learning.regform.entity.RoleType;
import com.learning.regform.entity.User;
import com.learning.regform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String addUser(User user, Map<String, Object> model) {
        User userDB = userRepository.findByLogin(user.getLogin());

        //TODO Refactor using Optioanl

        if (userDB != null) {
            model.put("message", "User with this login already exist");
            return "register";
        }

        user.setActivityStatus(true);
        user.setRole(Collections.singleton(RoleType.USER));
        userRepository.save(user);

        return "redirect:/login";
    }
}
