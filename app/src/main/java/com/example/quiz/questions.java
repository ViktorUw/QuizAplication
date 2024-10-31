package com.example.quiz;

import android.widget.TextView;

public class questions {

    private String question;
    private String answer_1;
    private String answer_2;
    private String answer_3;
    private String answer_4;
    private String correct_answer;

    public questions(String question, String answer_1, String answer_2, String answer_3, String answer_4, String correct_answer){
        this.question = question;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.answer_4 = answer_4;
        this.correct_answer = correct_answer;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public String getAnswer_4() {
        return answer_4;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public String getQuestion() {
        return question;
    }
}
