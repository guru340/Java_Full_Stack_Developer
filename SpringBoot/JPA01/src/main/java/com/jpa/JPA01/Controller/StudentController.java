package com.jpa.JPA01.Controller;

import com.jpa.JPA01.Entity.Student;
import com.jpa.JPA01.Entity.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo){
        this.studentRepo=studentRepo;
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student ) {
        return studentRepo.save(student);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @PutMapping
    public Student updatestudent(@RequestParam Long id,@RequestBody Student student){
        Student s=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not Found"));;
        s.setName(student.getName());
        s.setEmail(student.getEmail());
        return studentRepo.save(s);
    }
    @PatchMapping
    public Student patchstudent(@RequestParam Long id,@RequestParam String name){
        Student s=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not Found"));
        s.setName(name);
        return s;

    }


}
