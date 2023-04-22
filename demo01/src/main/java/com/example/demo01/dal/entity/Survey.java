package com.example.demo01.dal.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Survey {

    @Id
    @Getter
    @Setter
    private Long id;

    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey", orphanRemoval = true, fetch = FetchType.EAGER)
    private List<SurveyQuestion> surveyQuestionList = new ArrayList<>();


}
