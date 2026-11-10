package com.practice.todolist.request;

import com.practice.todolist.model.Todo.Status;

public class TodoRequest {
    
    private String title;
    private String description;
    private Status todoStatus;

    public TodoRequest(){}

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

    public Status getTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(Status todoStatus) {
        this.todoStatus = todoStatus;
    }

    @Override
    public String toString() {
        return "TodoRequest [title=" + title + ", description=" + description + ", todoStatus=" + todoStatus + "]";
    }

    
}
