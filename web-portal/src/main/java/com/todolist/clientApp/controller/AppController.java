package com.todolist.clientApp.controller;

import com.todolist.clientApp.dto.*;
import com.todolist.clientApp.service.WebService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@Controller
@AllArgsConstructor
@Slf4j
public class AppController implements ErrorController {
    private final WebService service;

    @GetMapping("/todo-app")
    public String index(){
        return "user_component/home";
    }

    @GetMapping("/todo-app/profile")
    public String profile(Model model){
        return null;
    }

    @PostMapping("/todo-app/register")
    public String register(@ModelAttribute RegistrationRequest request) {
        try {
            int statusCode = service.register(request);
            if (statusCode == 201){
                log.info("Registration Done Successfully;");
                return "redirect:/todo-app?registrationSuccess=true";
            }
        } catch (HttpClientErrorException ex) {
            String errorMessage = ex.getResponseBodyAsString();
            log.error("Validation failed: {}", errorMessage);
        }
        return "redirect:/todo-app?registrationSuccess=false";
    }

    @PostMapping("/todo-app/login")
    String login(@ModelAttribute AuthenticationRequest request) {
        return null;
    }

    @PostMapping("/todo-app/reset-password")
    String sendResetMail(@ModelAttribute ResetPasswordRequest request) {
        return null;
    }
    @GetMapping("/todo-app/logout")
    String logout() {
        service.logout();
        return "redirect:/todo-app";
    }

    @PostMapping("/todo-app/profile/addTask")
    String addTask(@ModelAttribute Task task) {
        return null;
    }

    @PostMapping("/todo-app/profile/updateTask/{id}")
    String updateTask(@PathVariable("id") Integer id,
                      @ModelAttribute Task task) {
        return null;
    }

    @GetMapping("/todo-app/profile/deleteTask/{id}")
    String deleteTask(@PathVariable("id") Integer id) {
        return null;
    }

    @GetMapping("/todo-app/profile/filter=personal")
    public String getPersonalTasks(Model model) {
        return null;
    }

    @GetMapping("/todo-app/profile/filter=work")
    public String getWorkTasks(Model model) {
        return null;
    }

    @GetMapping("/todo-app/profile/filter=today")
    public String getTodayTasks(Model model) {
        return null;
    }

    @GetMapping("/todo-app/profile/filter=next-week")
    public String getWeeklyTasks(Model model) {
        return null;
    }

    @GetMapping("/todo-app/profile/filter=in-progress")
    public String getInProgressTasks(Model model) {
        return null;
    }

    @GetMapping("/todo-app/profile/filter=completed")
    public String getCompletedTasks(Model model) {
        return null;
    }

    @GetMapping("/todo-app/profile/filter=overdue")
    public String getOverdueTasks(Model model) {
        return null;
    }

    @RequestMapping("/error")
    public String handleError() {
        return "error";
    }
}
