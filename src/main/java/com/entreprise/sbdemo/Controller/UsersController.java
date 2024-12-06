package com.entreprise.sbdemo.Controller;
import com.entreprise.sbdemo.Entity.Users;
import com.entreprise.sbdemo.Service.UsersService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("post")
    public ResponseEntity<Optional<Users>> postUser(@RequestBody Users user)
    {
        Optional<Users> oUser = this.userService.saveUser(user);
        if(oUser.isEmpty())
        {
            HttpHeaders header = new HttpHeaders();
            header.set("CustomErrorMessage", "Email already in used.");
            return new ResponseEntity<>(null,header,HttpStatusCode.valueOf(500));
        }
        else
        {
            return ResponseEntity.ok(this.userService.getUser(oUser.get().getId()));
        }
    }

    @DeleteMapping("Delete/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable long id)
    {
        Boolean b = this.userService.deleteUser(id);
        if(b)
        {
            return ResponseEntity.ok(Boolean.TRUE);
        }
        else
        {
            HttpHeaders header = new HttpHeaders();
            header.set("CustomErrorMessage", "Id doesnt exist.");
            return new ResponseEntity<>(Boolean.FALSE,header,HttpStatusCode.valueOf(500));
        }
    }

    @PutMapping("Put/{id}")
    public ResponseEntity<Boolean> putUser(@PathVariable Long id, @RequestParam(required = false) String name)
    {
        Optional<Users> i = this.userService.modifyUsersName(name, id);
        if(i.isEmpty())
        {
            HttpHeaders header = new HttpHeaders();
            header.set("CustomErrorMessage", "Id doesnt exist.");
            return new ResponseEntity<>(Boolean.FALSE,header,HttpStatusCode.valueOf(500));
        }
        else
        {
            return ResponseEntity.ok(Boolean.TRUE);
        }
    }
}
