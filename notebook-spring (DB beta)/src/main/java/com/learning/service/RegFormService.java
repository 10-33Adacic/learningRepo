package com.learning.service;

/**
 * Created by Templar on 13.08.2019.
 */
import com.learning.entity.User;
import com.learning.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.learning.dto.NoteDTO;

@Service
public class RegFormService {
    private final UserRepository userRepository;

    public RegFormService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser (User user) {
        userRepository.save(user);
    }
}
