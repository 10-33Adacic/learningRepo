package com.learning.controller;

/**
 * Created by Templar on 13.08.2019.
 */
import com.learning.entity.Role;
import com.learning.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.learning.dto.NoteDTO;
import com.learning.service.RegFormService;

@Slf4j
@RestController
@RequestMapping(value = "/regform")
public class RegFormController {

    private final RegFormService regFormService;

    @Autowired
    public RegFormController(RegFormService regFormService) {
        this.regFormService = regFormService;
    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @RequestMapping(value = "/regform", method = RequestMethod.POST)
//    public void registrationFormController(NoteDTO note){
//        log.info("{}", note);
//    }

    @PostMapping("/regform")
    public String addUser(User user) {
//        user.setActive(true);
        user.setRole(Role.USER);
        log.info("{}",user);
        try {
            regFormService.saveUser(user);
        } catch (DataIntegrityViolationException e) {
//            Map<String, String> map = new HashMap<>();
//            map.put("spring", "mvc");
//            model.addAttribute("message", "user already exists");
//            model.mergeAttributes(map);
            log.info("{Почтовый адрес уже существует}");
            return "reg_form.ftl";
        }
        return "redirect:/logform";
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity handleRuntimeException(RuntimeException ex) {
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
