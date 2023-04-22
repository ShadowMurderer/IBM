package com.example.demo01.service;


import com.example.demo01.dal.entity.SurveyQuestion;
import com.example.demo01.dal.repository.SurveyQuestionRepository;
import com.example.demo01.service.dto.SurveyQuestionUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SurveyQuestionService {

    private final SurveyQuestionRepository surveyQuestionRepository;

    public SurveyQuestion updateSurveyQuestion(Long surveyQuestionId, SurveyQuestionUpdateRequestDto surveyQuestionUpdateRequestDto)
    {
        //TODO @ students: logging

        SurveyQuestion surveyQuestionToUpdate = surveyQuestionRepository.findById(surveyQuestionId).get(); //TODO @ students: what happens if no surverQuestion is returned?

        surveyQuestionToUpdate.setBody(surveyQuestionUpdateRequestDto.getBody());    //TODO @ students: what happens if no http body sent?

        SurveyQuestion surveyQuestionUpdated = surveyQuestionRepository.save(surveyQuestionToUpdate);

        return surveyQuestionUpdated;
    }
}
