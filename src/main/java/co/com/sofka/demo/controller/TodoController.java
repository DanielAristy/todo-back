package co.com.sofka.demo.controller;

import co.com.sofka.demo.entity.Todo;
import co.com.sofka.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo> list(){
        return service.list();
    }

    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){
        return service.save(todo);
    }

    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if (todo.getId() != null){
            return service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping("api/{id}/todo")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping(value = "apli/{id}/todo")
    public Todo getId(@PathVariable("id") Long id){
        return service.getId(id);
    }
}
