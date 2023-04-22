package com.example.demo01.dal.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Survey {

    @Id
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<SurveyQuestion> surveyQuestionList = new ArrayList<>();
}
