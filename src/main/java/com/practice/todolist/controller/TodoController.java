package com.practice.todolist.controller;

import org.springframework.web.bind.annotation.RestController;

import com.practice.todolist.model.Todo;
import com.practice.todolist.request.TodoRequest;
import com.practice.todolist.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;




@RestController 
@RequestMapping("/todos")
public class TodoController {

    private TodoService service;

    TodoController(TodoService service){
        this.service = service;
    }

    @PostMapping("")
    public Todo addTodo(@RequestBody TodoRequest todoItem){
        return service.addTodo(todoItem.getTitle(), todoItem.getDescription());
    }

    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody TodoRequest entity) {
        return service.updateTodo(id, entity.getTitle(), entity.getDescription(), entity.getTodoStatus());
    }

    @GetMapping("/{id}")
    public Optional<Todo> getTodoById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    @GetMapping("")
    public List<Todo> getAll() {
        return service.getAll();
    }
    
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id){
        service.deleteTodo(id);
    }
}
