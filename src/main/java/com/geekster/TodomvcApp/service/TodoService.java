package com.geekster.TodomvcApp.service;

import com.geekster.TodomvcApp.model.Todo;
import com.geekster.TodomvcApp.repository.ITodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    ITodoRepo todoRepo;

    public String createTodo(Todo myTodo) {
        todoRepo.save(myTodo);
        return "Todo is Created.";
    }

    public String createTodos(List<Todo> myTodos) {
        todoRepo.saveAll(myTodos);
        return "Todos are Created.";
    }
    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }

    public List<Todo> getAllDoneTodos() {
        return todoRepo.findByIsTodoStatusTrue();
    }

    public List<Todo> getAllUnDoneTodos() {
        return todoRepo.findByIsTodoStatusFalse();
    }

    public Todo getTodoById(Long id) {
        return todoRepo.findById(id).orElse(null);
    }

    public Todo getTodoByTask(String task) {
        return todoRepo.findByTask(task);
    }

    public String updateTodoStatus(Long id, boolean status) {
        Optional<Todo> myTodo = todoRepo.findById(id);
        if(myTodo.isEmpty())
            return "Todo id: " +id +" - is not found";

        myTodo.get().setTodoStatus(status);
        todoRepo.save(myTodo.get());

        return "Todo id: " +id +"- Status is updated";
    }

    public String updateTodoDescription(Long id, String newDescription) {
        Optional<Todo> myTodo = todoRepo.findById(id);
        if(myTodo.isEmpty())
            return "Todo id: " +id +" - is not found";

        myTodo.get().setTaskDescription(newDescription);
        todoRepo.save(myTodo.get());

        return "Todo id: " +id +"- New Description is updated";
    }


    public String removeTodo(Long id) {
        Optional<Todo> myTodo = todoRepo.findById(id);
        if(myTodo.isEmpty())
            return "Todo id: " +id +" - is not found";

        todoRepo.deleteById(id);
        return "Todo ID: "+id+" is deleted";
    }

}
