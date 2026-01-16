package com.example.first;

import com.example.first.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
@Autowired
StudentRepository studentrepository;
    @PostMapping
    public Student create(@RequestBody Student student ){
        return studentrepository.save(student);
    }
    //pagination

    @GetMapping("/pagination")
    public Page<Student> display(@RequestParam int page,@RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return studentrepository.findAll(pageable);
    }
}