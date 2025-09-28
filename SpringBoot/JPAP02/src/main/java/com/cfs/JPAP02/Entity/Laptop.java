package com.cfs.JPAP02.Entity;

import jakarta.persistence.*;
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;


    @OneToOne
    @JoinColumn(name="student_id",unique = true)
    private Student student;
//   jaha aapki foreign key hoti hai uss side hi join columns lagate hai



}
