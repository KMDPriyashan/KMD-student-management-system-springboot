package org.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String indexNumber;
    private String fullName;
    private String address;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String nic;
}
