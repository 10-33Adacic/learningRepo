package com.learning.entity;

/**
 * Created by Templar on 13.08.2019.
 */
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {

    private Long id;

    private String names;

    private String email;

    private String login;

    private String password;

}
