package com.wilson.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wilson.controller.BookEntity;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}
