package com.cfs.BOOTP02.Controller;

import com.cfs.BOOTP02.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentcOntroller {
    @Autowired
    StudentService service;
    @GetMapping( "/welcome")
    public String dataFetchFromdb(){
      return service.getStudentData();
    }
    @PostMapping
    public void test(){

    }
    @DeleteMapping
    public void test2(){
        System.out.println("Hello Ji");
    }
}
