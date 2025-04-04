package com.example.sp5_chap12.survey;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class AnsweredData {
    private List<String> responses;
    private Respondent res;
}
