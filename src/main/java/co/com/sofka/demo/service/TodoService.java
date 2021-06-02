package co.com.sofka.demo.service;

import co.com.sofka.demo.entity.Todo;
import co.com.sofka.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    //Metodo para listar los datos
    public Iterable<Todo> list(){
        return todoRepository.findAll();
    }
    //Metodo para guardar el todo
    public Todo save(Todo todo){
        return todoRepository.save(todo);
    }
    //Metodo para eliminar por id
    public void delete(Long id){
        todoRepository.delete(getId(id));
    }
    //Método para obtener un todo por id
    public Todo getId(Long id){
        return todoRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
