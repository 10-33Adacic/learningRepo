package com.learning.dto;

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
public class NoteDTO {
    private String first_name;
    private String last_name;
    private String email;
    private String nickname;
    private String password;
}
