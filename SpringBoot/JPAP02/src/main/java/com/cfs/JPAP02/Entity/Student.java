package com.cfs.JPAP02.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.engine.profile.Fetch;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //    cascade mean agr parent class me data nhi hoge to child me bhi nhi hoga aur agr dono me nhi hua to cascade fail ho jayega
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="teacher_id")
    private Teacher teacher;

    @ManyToMany
    @JoinTable(
            name="student_course",
            joinColumns=@JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")

    )
    @JsonIgnoreProperties("student")
    private Set<Courses> courses=new HashSet<>();


}
