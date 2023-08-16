package com.codeup.tasker.Repos;

import com.codeup.tasker.Models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
    Task findByTitle(String title);
}
