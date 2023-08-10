package com.codeup.tasker.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, columnDefinition = "VarChar(150)")
    private String title;
    @Column(nullable = true, columnDefinition = "Text")
    private String body;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TaskType",
    joinColumns = {@JoinColumn(name = "task_type")},
    inverseJoinColumns = {@JoinColumn(name = "task_id")}
    )
    List<Task>task;
}
