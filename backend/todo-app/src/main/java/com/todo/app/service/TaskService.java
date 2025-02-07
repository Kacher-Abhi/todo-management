package com.todo.app.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.entity.Task;
import com.todo.app.repo.TaskRepo;

@Service
public class TaskService {

	@Autowired
	private TaskRepo taskRepo;

	public List<Task> getAll() {
		return taskRepo.findAll();
	}

	public Task createTask(Task task) {

		return taskRepo.save(task);
	}

	public Optional<Task> getById(UUID id) {
		return taskRepo.findById(id);
	}

}
