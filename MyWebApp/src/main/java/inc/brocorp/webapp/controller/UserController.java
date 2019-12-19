package inc.brocorp.webapp.controller;


import inc.brocorp.webapp.entity.Task;
import inc.brocorp.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/tasks")
    public String showAll(Model model) {
        model.addAttribute("tasks", userService.showAll());
        return "taskList";
    }

    @GetMapping("/task/{id}")
    public String showTask(@PathVariable("id") int id, Model model) {
        model.addAttribute("task", userService.getById(id));
        return "showTask";
    }

    @GetMapping("/test")
    public String hello(Model model) {
        model.addAttribute("msg", "It is work.");
        return "test";
    }

    @GetMapping("/addTask")
    public String createTask(){
        return "addTask";
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute("task") Task task) {
        userService.create(task);
        return "redirect:/tasks";
    }
}
