package com.example.first;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class Todo {
    //Path variable
    @GetMapping("{id}")
    String todo(@PathVariable int id){
        return "welcome"+id;
    }
    //RequestParam
    @GetMapping
    String todoParam(@RequestParam String username){
        return username;
    }
    @PostMapping("/create")
    String create(@RequestBody String body){
        return body;
    }
    @PutMapping("{id}")
    String todoupdate(@PathVariable int id){
        return "welcome"+id;
    }
    @DeleteMapping("{id}")
    String tododelete(@PathVariable int id){
        return "welcome"+id;
    }
}
