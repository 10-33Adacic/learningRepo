package com.learning.regform.controller;

import com.learning.regform.entity.Message;
import com.learning.regform.entity.User;
import com.learning.regform.repository.MessageRepo;
import com.learning.regform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

////    //При задании имени в строке браузера, выводит не Hello World, a Hello имя
////    @GetMapping("/")
////    public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
////                                       String name, Model model) {
////        model.addAttribute("name", name);
////        return "greeting";
////    }
//
////    //Форма выдачи
////    @PostMapping
////    public String add(Map<String, Object> model) {
////        Iterable<User> users = userRepository.findAll();
////        model.put("users", users);
////        return "addUser";
////    }
//
//    @PostMapping
//    public String addUser(User user) {
//        userRepository.save(user);
//        return "redirect:/login";
//    }

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @PostMapping("/main")
    public String add(@RequestParam String text, @RequestParam String tag, @AuthenticationPrincipal User user, Map<String, Object> model) {
        Message message = new Message(text, tag, user);

        messageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Message> messages;

        if (filter != null && !filter.isEmpty()) {
            messages = messageRepo.findByTag(filter);
        } else {
            messages = messageRepo.findAll();
        }

        model.put("messages", messages);

        return "main";
    }

}
