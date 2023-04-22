package com.example.demo01.controller;

import com.example.demo01.dal.entity.Survey;
import com.example.demo01.dal.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SurveyController {

    //TODO reminder: be careful here -> @Autowired not needed, due to 'final' and '@RequiredArgsConstructor'
    private final SurveyRepository surveyRepository;

    @GetMapping("/surveys")
    public List<Survey> getAllSurveys() {
        log.info("retrieving all surveys");

        List<Survey> surveyList = surveyRepository.findAll();
        log.info("retrieved {} surveys", surveyList.size());

        return surveyList;
    }

    @GetMapping("/surveys/{surveyId}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable("surveyId") Long surveyId) {
        Survey survey = surveyRepository.findById(surveyId).get();      //TODO @ students: can you do it more professional?

        return ResponseEntity.ok(survey);
    }
}
