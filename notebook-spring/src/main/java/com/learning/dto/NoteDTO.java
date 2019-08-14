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
    private String names;
    private String login;
}
