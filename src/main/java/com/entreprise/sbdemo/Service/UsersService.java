package com.entreprise.sbdemo.Service;
import com.entreprise.sbdemo.Entity.Users;
import com.entreprise.sbdemo.Repository.UsersRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        //Verify if the email is already user
        //If yes return empty to the controller
        if(userRepo.findUsersByEmail(user.getEmail()).isPresent())
        {
            return Optional.empty();
        }
        //If no save it and return the now save user
        else
        {
            return Optional.of(userRepo.save(user));
        }
    }

    public Boolean deleteUser(Long id)
    {
        if(userRepo.findById(id).isPresent())
        {
            userRepo.deleteById(id);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Transactional
    public Optional<Users> modifyUsersName(String newName, Long id)
    {
        Optional<Users> user = userRepo.findById(id);
        if(user.isPresent())
        {
            user.get().setName(newName);
            return user;
        }
        else
        {
            return Optional.empty();
        }
    }
}
