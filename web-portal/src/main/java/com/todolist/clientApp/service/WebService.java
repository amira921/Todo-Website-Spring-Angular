package com.todolist.clientApp.service;

import com.todolist.clientApp.dto.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class WebService{
    private final RestTemplate template;
    private final RestTemplateBuilder restTemplateBuilder;
    private static final String BASE_URL = "http://API-GATEWAY";
    private static final String BASE_ENDPOINT = "http://localhost:8080";
    private static final String REGISTER_URL = "/auth/register";
    private static final String LOGIN_URL = "/auth/login";
    private static final String RESET_URL = "/auth/reset-password";
    private static final String PROFILE_URL = "/profile/";
    private static final String UPDATE_URL = "/updateTask/";
    private static final String ADD_URL = "/addTask";
    private static final String DELETE_URL = "/deleteTask/";
    private static final String FILTER_URL = "/filter=";
    public static String jwtToken;
    public static String email;

    public int register(RegistrationRequest request){
        return 0;
    }

    public int login(AuthenticationRequest request){
        return 0;
    }

    private RestTemplate getRestTemplateWithToken() {
        return null;
    }

    public List<Task> accessProfile(){
        return null;
    }

    public void logout(){
        jwtToken=null;
    }

    public void sendResetMail(String email) {
    }

    public String addTask(Task task){
        return null;
    }

    public String updateTask(Task task){
        return null;
    }

    public String deleteTask(Integer id){
        return null;
    }


    public List<Task> getInProgressTasks() {
        return null;

    }

    public List<Task> getCompletedTasks() {
        return null;

    }

    public List<Task> getOverdueTasks() {
        return null;

    }

    public List<Task> getPersonalTasks() {
        return null;

    }

    public List<Task> getWorkTasks() {
        return null;

    }

    public List<Task> getTodayTasks() {
        return null;
    }

    public List<Task> getWeeklyTasks() {
        return null;
    }

    public ResponseEntity<?> redirectGoogle() {
        return null;
    }
}
