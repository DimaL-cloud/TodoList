package ua.dimalutsyuk.ToDoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.dimalutsyuk.ToDoList.entity.Task;
import ua.dimalutsyuk.ToDoList.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/ascending")
    public List<Task> getAllTasksOrderedByAscending() {
        return taskService.getAllTasksOrderedByAscending();
    }

    @GetMapping("/done")
    public List<Task> getDoneTasks() {
        return taskService.getDoneTasks();
    }

    @GetMapping("/done/ascending")
    public List<Task> getDoneTasksOrderedByAscending() {
        return taskService.getDoneTasksOrderedByAscending();
    }

    @GetMapping("/todo")
    public List<Task> getTodoTasks() {
        return taskService.getTodoTasks();
    }

    @GetMapping("/todo/ascending")
    public List<Task> getTodoTasksOrderedByAscending() {
        return taskService.getTodoTasksOrderedByAscending();
    }

    @PostMapping
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id,
                           @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @DeleteMapping
    public void deleteAllTasks() {
        taskService.deleteAllTasks();
    }

    @DeleteMapping("/{id}")
    public void deleteTaskById(@PathVariable Long id) {
        taskService.deleteTaskById(id);
    }
}
