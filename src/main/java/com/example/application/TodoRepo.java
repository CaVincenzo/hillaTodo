package com.example.application;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// A way to get and save in the Database
public interface TodoRepo extends JpaRepository<Todo,Long> {

    public List<Todo> getAllByDoneIsFalse();

    public List<Todo> getAllByDoneIsTrue();


}