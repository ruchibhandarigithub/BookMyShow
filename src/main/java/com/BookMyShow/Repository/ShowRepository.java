package com.BookMyShow.Repository;

import com.BookMyShow.Models.ShowEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {

}
