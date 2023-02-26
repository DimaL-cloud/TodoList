package ua.dimalutsyuk.ToDoList.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dimalutsyuk.ToDoList.entity.Task;
import ua.dimalutsyuk.ToDoList.repository.TaskRepository;
import ua.dimalutsyuk.ToDoList.service.TaskService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task taskEntity = taskRepository.findById(id).orElseThrow(NoSuchElementException::new);

        taskEntity.setDescription(task.getDescription());
        taskEntity.setDone(task.isDone());

        taskRepository.save(taskEntity);

        return taskEntity;
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAllByOrderByIdDesc();
    }

    @Override
    public List<Task> getAllTasksOrderedByAscending() {
        return taskRepository.findAllByOrderByIdAsc();
    }

    @Override
    public List<Task> getDoneTasks() {
        return taskRepository.findAllByDoneIsTrueOrderByIdDesc();
    }

    @Override
    public List<Task> getDoneTasksOrderedByAscending() {
        return taskRepository.findAllByDoneIsTrueOrderByIdAsc();
    }

    @Override
    public List<Task> getTodoTasks() {
        return taskRepository.findAllByDoneIsFalseOrderByIdDesc();
    }

    @Override
    public List<Task> getTodoTasksOrderedByAscending() {
        return taskRepository.findAllByDoneIsFalseOrderByIdAsc();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void deleteTaskById(Long id) {
        Task taskEntity = taskRepository.findById(id).orElseThrow(NoSuchElementException::new);
        taskRepository.delete(taskEntity);
    }

    @Override
    public void deleteAllTasks() {
        taskRepository.deleteAll();
    }
}
