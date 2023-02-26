package ua.dimalutsyuk.ToDoList.service;

import ua.dimalutsyuk.ToDoList.entity.Task;

import java.util.List;

public interface TaskService {
    Task saveTask(Task task);

    void deleteTaskById(Long id);

    void deleteAllTasks();

    Task updateTask(Long id, Task task);

    List<Task> getAllTasks();

    List<Task> getAllTasksOrderedByAscending();

    List<Task> getDoneTasks();

    List<Task> getDoneTasksOrderedByAscending();

    List<Task> getTodoTasks();

    List<Task> getTodoTasksOrderedByAscending();

    Task getTaskById(Long id);
}
