package inc.brocorp.webapp.controller;

import inc.brocorp.webapp.TestClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg2","String from model.");
        return "startPage";
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        List<TestClass> users = new LinkedList<>();
        users.add(new TestClass("Nick", 35));
        users.add(new TestClass("Collin", 55));
        model.addAttribute("users", users);
        return "users";
    }
}
