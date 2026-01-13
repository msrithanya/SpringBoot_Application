package com.example.first;

import com.example.first.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoRepository todorepository;
    public Todo action(Todo todo){
        return todorepository.save(todo);
    }
    public Todo display(Long Id){
        return todorepository.getReferenceById(Id);
    }
    public Todo finds(Long Id){
        return todorepository.findById(Id).orElseThrow(()->new RuntimeException("no data found"));
    }
}
