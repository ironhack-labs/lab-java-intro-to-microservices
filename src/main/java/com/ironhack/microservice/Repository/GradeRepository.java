package com.ironhack.microservice.Repository;

import com.ironhack.microservice.Model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findAll();
}

