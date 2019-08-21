package com.learning.regform.repository;

import com.learning.regform.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
