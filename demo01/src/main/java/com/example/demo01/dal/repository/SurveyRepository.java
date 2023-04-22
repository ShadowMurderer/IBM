package com.example.demo01.dal.repository;

import com.example.demo01.dal.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
