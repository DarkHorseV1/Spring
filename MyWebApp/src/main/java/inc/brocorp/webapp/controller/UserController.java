package inc.brocorp.webapp.controller;


import inc.brocorp.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/tasks")
    public String showAll(Model model){
        model.addAttribute("tasks", userService.showAll());
        return "taskList";
    }

    @GetMapping("/test")
    public String hello(Model model){
        model.addAttribute("msg","It is work.");
        return "test";
    }
}
