package com.geekster.TodomvcApp.repository;

import com.geekster.TodomvcApp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITodoRepo extends JpaRepository<Todo,Long> {


    List<Todo> findByIsTodoStatusTrue();
    List<Todo> findByIsTodoStatusFalse();
    Todo findByTask(String task);
}
