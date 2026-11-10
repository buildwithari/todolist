package com.practice.todolist.service;

import org.springframework.stereotype.Service;

import com.practice.todolist.model.Todo;
import com.practice.todolist.model.Todo.Status;
import com.practice.todolist.repository.TodoRepository;
import java.util.*;

@Service 
public class TodoService {
    
    private TodoRepository todoRepository;

    TodoService(TodoRepository repository){
        this.todoRepository = repository;
    }

    public Todo addTodo(String title, String description){
        Todo todo = new Todo(title, description);
        return todoRepository.save(todo);
    }

    public List<Todo> getAll(){
        return todoRepository.findAll();
    }

    public Optional<Todo> getById(Long id){
        return todoRepository.findById(id);
    }

    public Todo updateTodo(Long id, String title, String description, Status status){
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        if (title != null) todo.setTitle(title);
        if (description != null) todo.setDescription(description);
        if (status != null) todo.setTodo_status(status);
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id){
        todoRepository.deleteById(id);
    }
}
