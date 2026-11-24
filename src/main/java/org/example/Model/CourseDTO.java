package org.example.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class CourseDTO {
    private String code;
    private String name;
    private String description;
    private String fee;
    private String credit;
    private String duration;
}
