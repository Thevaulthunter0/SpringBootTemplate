package com.entreprise.sbdemo.Controller;
import com.entreprise.sbdemo.Entity.Users;
import com.entreprise.sbdemo.Service.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
public class UsersController {

    public UsersService userService;

    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    @GetMapping("all")
    public List<Users> getUsers()
    {
        return this.userService.getUsers();
    }

    @GetMapping("get/{id}")
    public Optional<Users> getUser(@PathVariable Long id)
    {
        return this.userService.getUser(id);
    }

    @PostMapping("post/{user}")
    public Optional<Users> postUser(@PathVariable Users user)
    {
        return this.userService.saveUser(user);
    }
}
