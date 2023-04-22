package com.example.demo01.dal.repository;

import com.example.demo01.dal.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
    Optional<Survey> findByname(String name);
}
