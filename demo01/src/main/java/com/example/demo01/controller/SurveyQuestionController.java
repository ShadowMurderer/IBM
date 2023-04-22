package com.example.demo01.controller;

import com.example.demo01.dal.entity.SurveyQuestion;
import com.example.demo01.service.SurveyQuestionService;
import com.example.demo01.service.dto.SurveyQuestionUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SurveyQuestionController {

    private final SurveyQuestionService surveyQuestionService;

    @PutMapping("/surveys/questions/{questionId}")
    public SurveyQuestion updateSurveyQuestion(
            @PathVariable("questionId") Long questionId,
            @RequestBody SurveyQuestionUpdateRequestDto surveyQuestionUpdateRequestDto) {

        //TODO @ students: logging

        return surveyQuestionService.updateSurveyQuestion(questionId, surveyQuestionUpdateRequestDto);

    }

}
