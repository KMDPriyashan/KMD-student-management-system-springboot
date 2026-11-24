package org.example.Model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class InstructoreDTO {
    private String code;
    private String fullName;
    private String address;
    private String email;
    private String age;
    private String subjectName;
}
