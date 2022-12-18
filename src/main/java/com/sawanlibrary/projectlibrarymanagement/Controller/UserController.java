package com.sawanlibrary.projectlibrarymanagement.Controller;

import com.sawanlibrary.projectlibrarymanagement.Entity.User;
import com.sawanlibrary.projectlibrarymanagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // GET APIs
    @GetMapping("/users")
    public List<User> users(){
        return userService.getUsers();
    }

    @GetMapping("/user/id")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    // POST APIs
    @PostMapping("/regUser")
    public User adduser(@RequestBody User user){
        return userService.regUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.regUsers(users);
    }

    // PUT API
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    // DELETE API
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteById(id);
    }
}
