package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.first.model.Todo;
@RestController
@RequestMapping("/todo")
public class TodosController {
    @Autowired
    TodoService todoservice;
    //Path variable
//    @GetMapping("{id}")
//    String todo(@PathVariable int id){
//        return "welcome"+id;
//    }


    //RequestParam
    @GetMapping
    String todoParam(@RequestParam String username){
        return username;
    }

    @PostMapping("/create")
    Todo create(@RequestBody Todo todo){
        return todoservice.action(todo);
    }
//    @GetMapping("{id}")
//    Todo todoupdate(@PathVariable Long id){
//        return todoservice.display(id);
//    }
    @GetMapping("{id}")
    Todo finding(@PathVariable Long id){
        return todoservice.finds(id);
    }
    @DeleteMapping("{id}")
    String tododelete(@PathVariable int id){
        return "welcome"+id;
    }
}
