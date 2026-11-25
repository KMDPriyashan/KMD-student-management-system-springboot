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
    private int credit;
    private int maxCapacity;
}
