package org.example.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student {
    private String indexNumber;
    private String fullName;
    private String address;
    private String dateOfBirth;
    private String gender;
    private Integer phoneNumber;
    private int nic;
}
