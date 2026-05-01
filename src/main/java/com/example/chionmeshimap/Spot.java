package com.example.chionmeshimap;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String station;
    private String name;
    private String menu;
    private String price;
    private int rating;
    private String comment;
    private String url;
    private String author;
}
