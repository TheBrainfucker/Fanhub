package com.github.TheBrainfucker.Fanhub.repository;

import com.github.TheBrainfucker.Fanhub.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
