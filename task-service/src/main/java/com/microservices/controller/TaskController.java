package com.microservices.controller;

import com.microservices.service.TaskService;
import com.microservices.dto.TaskDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/profile/{email}")
@AllArgsConstructor
@Slf4j
public class TaskController {
    private final TaskService service;

    @GetMapping("")
    public ResponseEntity<?> getTasks(@PathVariable String email) {
        List<Object> tasks = new ArrayList<>();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(tasks);
    }

    @GetMapping("/filter=personal")
    public ResponseEntity<?> getPersonalTasks(@PathVariable String email) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/filter=work")
    public ResponseEntity<?> getWorkTasks(@PathVariable String email) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/filter=today")
    public ResponseEntity<?> getTodayTasks(@PathVariable String email) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/filter=next-week")
    public ResponseEntity<?> getWeeklyTasks(@PathVariable String email) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/filter=in-progress")
    public ResponseEntity<?> getInProgressTasks(@PathVariable String email) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/filter=completed")
    public ResponseEntity<?> getCompletedTasks(@PathVariable String email) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/filter=overdue")
    public ResponseEntity<?> getOverdueTasks(@PathVariable String email) {
        return ResponseEntity.ok("");
    }

    @PostMapping("/addTask")
    public ResponseEntity<?> createTask(@Valid @RequestBody TaskDTO task, @PathVariable String email) {
        return ResponseEntity.ok("");
    }
    @PostMapping("/updateTask/{taskId}")
    public ResponseEntity<?> updateTask(@PathVariable("email")  String email,
                             @PathVariable("taskId") Integer taskId,
                             @RequestBody @Valid TaskDTO task) {
        return ResponseEntity.ok("");
    }
    @GetMapping ("/deleteTask/{taskId}")
    public ResponseEntity<?> deleteTask(@PathVariable("email")  String email, @PathVariable("taskId") Integer taskId) {
        return ResponseEntity.ok("");
    }
}
