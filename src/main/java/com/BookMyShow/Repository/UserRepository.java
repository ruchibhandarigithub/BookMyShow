package com.BookMyShow.Repository;

import com.BookMyShow.Models.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
