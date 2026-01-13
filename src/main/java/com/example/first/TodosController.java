package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.first.model.Todo;

import java.util.List;

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

    @PutMapping
    public Todo update(@RequestBody Todo todo){
       return todoservice.updates(todo);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        todoservice.deleteid(id);
    }
    @DeleteMapping
    public void deletetodo(Todo todo){
        todoservice.deleteall(todo);
    }
    @GetMapping("/getall")
    public List<Todo> all(){
        return todoservice.getall();
    }
}

