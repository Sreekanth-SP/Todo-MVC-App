package com.geekster.TodomvcApp.controller;

import com.geekster.TodomvcApp.model.Todo;
import com.geekster.TodomvcApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping("todo")                // Create one todo_
    public String createTodo(@RequestBody Todo myTodo) {
        return todoService.createTodo(myTodo);
    }
    @PostMapping("todos")               // Create todos
    public String createTodos(@RequestBody List<Todo> myTodos){
        return todoService.createTodos(myTodos);
    }

    @GetMapping("todos")                // Get All the todos
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }
    @GetMapping("todo/done")
    public List<Todo> getAllDoneTodos(){
        return todoService.getAllDoneTodos();
    }

    @GetMapping("todo/undone")
    public List<Todo> getAllUnDoneTodos(){
        return todoService.getAllUnDoneTodos();
    }

    @GetMapping("todo/id/{id}")
    public Todo getTodoById(@PathVariable Long id){
        return todoService.getTodoById(id);
    }

    @GetMapping("todo/task/{task}")
    public Todo getTodoByTask(@PathVariable String task){
        return todoService.getTodoByTask(task);
    }
    @PutMapping("todo/id/{id}/status/{status}")
    public String updateTodoStatus(@PathVariable Long id,@PathVariable  boolean status){
        return todoService.updateTodoStatus(id,status);
    }

    @PutMapping("todo/id/{id}")
    public String updateTodoDescription(@PathVariable Long id,@RequestParam String newDescription){
        return todoService.updateTodoDescription(id,newDescription);
    }
    @DeleteMapping("todo/{id}")
    public String removeTodo(@PathVariable Long id){
        return todoService.removeTodo(id);
    }
}
