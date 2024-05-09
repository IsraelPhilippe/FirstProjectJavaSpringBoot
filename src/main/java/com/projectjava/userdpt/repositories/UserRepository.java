package com.projectjava.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectjava.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
