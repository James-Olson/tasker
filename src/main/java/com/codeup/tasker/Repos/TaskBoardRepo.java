package com.codeup.tasker.Repos;

import com.codeup.tasker.Models.TaskBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskBoardRepo extends JpaRepository<TaskBoard, Long> {
    TaskBoard findById(Long id);
}
