package com.entreprise.sbdemo.Service;
import com.entreprise.sbdemo.Entity.Users;
import com.entreprise.sbdemo.Repository.UsersRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    public UsersRepo userRepo;

    public UsersService(UsersRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<Users> getUsers() {
        return userRepo.findAll();
    }

    public Optional<Users> getUser(Long id) {
        return userRepo.findById(id);
    }

    public Optional<Users> saveUser(Users user)
    {
        return Optional.of(userRepo.save(user));
    }
}
