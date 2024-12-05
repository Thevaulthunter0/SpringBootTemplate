package com.entreprise.sbdemo.Repository;

import com.entreprise.sbdemo.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,Long>
{

}
