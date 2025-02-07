package com.todo.app.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.app.entity.Task;

public interface TaskRepo extends JpaRepository<Task, UUID> {

}
