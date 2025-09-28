package com.cfs.BOOTP02.Service;

import com.cfs.BOOTP02.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;


    public String getStudentData(){
            return studentRepo.getStudentRepo();
    }
}
