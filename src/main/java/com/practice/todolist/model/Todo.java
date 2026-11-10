package com.practice.todolist.model;

import jakarta.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    public enum Status {
        NOT_STARTED, IN_PROGRESS, COMPLETE, BACKLOG
    }

    private Status todo_status;

    public Todo(){}

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
        this.todo_status = Status.NOT_STARTED;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getTodo_status() {
        return todo_status;
    }

    public void setTodo_status(Status todo_status) {
        this.todo_status = todo_status;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", todo_status=" + todo_status
                + "]";
    }

}
