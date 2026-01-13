package com.example.first;

import com.example.first.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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
    //all rows
    public List<Todo> getall(){
        return todorepository.findAll();
    }
    //404
    public Todo finds(Long Id) {
        return todorepository.findById(Id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Todo not found with id: " + Id
        ));
    }
        public Todo updates(Todo todo){
            return todorepository.save(todo);
        }
    public void deleteid(Long id){
        todorepository.delete(finds(id));
    }

    }


