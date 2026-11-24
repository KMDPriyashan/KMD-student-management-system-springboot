package org.example.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class StudentDTO {
    private String indexNumber;
    private String fullName;
    private String address;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String nic;
}
