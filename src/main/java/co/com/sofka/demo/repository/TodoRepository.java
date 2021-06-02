package co.com.sofka.demo.repository;

import co.com.sofka.demo.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,Long> {
}
