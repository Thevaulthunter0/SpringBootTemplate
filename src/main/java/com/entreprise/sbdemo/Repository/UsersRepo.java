package com.entreprise.sbdemo.Repository;

import com.entreprise.sbdemo.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users,Long>
{
    Optional<Users> findUsersByEmail(String email);
}
