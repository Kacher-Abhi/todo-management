package com.todo.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.entity.Task;
import com.todo.app.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@PostMapping("/create-task")
	public Task newTask(@RequestBody Task task) {
		return taskService.createTask(task);
	}

	@GetMapping("/get-all-tasks")
	public List<Task> getAll() {
		return taskService.getAll();
	}

	@GetMapping("get-task-byId/{id}")
	public Optional<Task> getById(@PathVariable("id") UUID id) {
		return taskService.getById(id);
	}

}
