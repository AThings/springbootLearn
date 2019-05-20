package com.example.expriment_1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int detail;
    private LocalDateTime insert_time;
    private int user_id;
    @ManyToOne
    private Users user;

    public Address(int detail){
        this.detail = detail;
    }
}
