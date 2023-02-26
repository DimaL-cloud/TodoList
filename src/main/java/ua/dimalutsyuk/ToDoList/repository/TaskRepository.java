package ua.dimalutsyuk.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dimalutsyuk.ToDoList.entity.Task;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByOrderByIdDesc();

    List<Task> findAllByOrderByIdAsc();

    List<Task> findAllByDoneIsTrueOrderByIdDesc();

    List<Task> findAllByDoneIsTrueOrderByIdAsc();

    List<Task> findAllByDoneIsFalseOrderByIdDesc();

    List<Task> findAllByDoneIsFalseOrderByIdAsc();
}
