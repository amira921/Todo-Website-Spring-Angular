package com.microservices.service.impl;
import com.microservices.dto.TaskDTO;
import com.microservices.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class TaskServiceImpl implements TaskService {
    @Override
    public List<TaskDTO> getTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public List<TaskDTO> getPersonalTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public List<TaskDTO> getWorkTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public List<TaskDTO> getTodayTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public List<TaskDTO> getWeeklyTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public List<TaskDTO> getInProgressTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public List<TaskDTO> getOverdueTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public List<TaskDTO> getCompletedTasksByUserEmail(String email) {
        return null;
    }

    @Override
    public TaskDTO addTask(TaskDTO task, String email) {
        return null;
    }

    @Override
    public TaskDTO updateTask(String email, Integer taskId, TaskDTO taskDTO) {
        return null;
    }

    @Override
    public void deleteTaskById(Integer taskId) {

    }
}
