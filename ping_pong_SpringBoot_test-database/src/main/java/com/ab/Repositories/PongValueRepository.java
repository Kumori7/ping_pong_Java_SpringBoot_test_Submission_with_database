package com.ab.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ab.Entities.Pong;

@Repository
public interface PongValueRepository extends JpaRepository<Pong, Integer> {

} // end of interface
