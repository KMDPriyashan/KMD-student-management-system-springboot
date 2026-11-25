package org.example.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String ISBN;
    private String title;
    private String author;
    private String category;
    private String availableStock;
}
