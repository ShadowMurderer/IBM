package com.example.demo01.service;


import com.example.demo01.dal.entity.Survey;
import com.example.demo01.dal.entity.SurveyQuestion;
import com.example.demo01.dal.repository.SurveyQuestionRepository;
import com.example.demo01.dal.repository.SurveyRepository;
import com.example.demo01.service.dto.SurveyQuestionUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SurveyQuestionService {

    private final SurveyQuestionRepository surveyQuestionRepository;


    public SurveyQuestion addSurveyQuestion(SurveyQuestion surveyQuestion) {

       return surveyQuestionRepository.save(surveyQuestion);

    }


    public SurveyQuestion updateSurveyQuestion(Long surveyQuestionId, SurveyQuestionUpdateRequestDto surveyQuestionUpdateRequestDto) {
        //TODO @ students: logging

        SurveyQuestion surveyQuestionToUpdate = surveyQuestionRepository.findById(surveyQuestionId).
                orElseThrow(() -> new RuntimeException("Survey question with ID " + surveyQuestionId + " not found")); //TODO @ students: what happens if no surverQuestion is returned?

        String requestBody = surveyQuestionUpdateRequestDto.getBody();///TODO @ students: what happens if no http body sent?

        if (requestBody == null || requestBody.trim().isEmpty()) {
            throw new RuntimeException("No HTTP body sent in the request");
        }

        surveyQuestionToUpdate.setBody(requestBody);

        SurveyQuestion surveyQuestionUpdated = surveyQuestionRepository.save(surveyQuestionToUpdate);

        return surveyQuestionUpdated;
    }

}
