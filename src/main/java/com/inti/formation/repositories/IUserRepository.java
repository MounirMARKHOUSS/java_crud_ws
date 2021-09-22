package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.models.User;

 
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
 User findByEmailAndPassword(String email, String password);
}
