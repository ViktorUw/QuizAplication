package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quiz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int question_number = 0;
    private int punkty = 0;
    private void set_question(int question_number){
        int num_of_quest = question_number + 1;

        binding.RBAnswer3.setText(DataProvider.questionsList.get(question_number).getAnswer_3());
        binding.numberOfAnswer.setText("Pytanie " + num_of_quest + "/10");
        binding.progressBar.setProgress(question_number*10);
        binding.questionTxt.setText(DataProvider.questionsList.get(question_number).getQuestion());
        binding.RBAnswer1.setText(DataProvider.questionsList.get(question_number).getAnswer_1());
        binding.RBAnswer2.setText(DataProvider.questionsList.get(question_number).getAnswer_2());
        binding.RBAnswer4.setText(DataProvider.questionsList.get(question_number).getAnswer_4());



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        DataProvider.fillList();


        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        set_question(question_number);

        binding.buttonNext.setOnClickListener(v -> {
            String correct_answer = DataProvider.questionsList.get(question_number).getCorrect_answer();
            RadioButton selectedRadioButton = binding.getRoot().findViewById(binding.questionsRg.getCheckedRadioButtonId());
            String answer = String.valueOf(selectedRadioButton.getText());
            if (binding.questionsRg.getCheckedRadioButtonId() != -1){
                question_number++;
                if (answer.equals(correct_answer)) {
                    punkty = punkty + 10;
                }

                    if(question_number < 10) {
                        set_question(question_number);

//                        binding.questionTxt.setText(answer + "\n" + correct_answer + "\n" + String.valueOf(question_number));

                    }
                    else{

                        binding.questionLayout.setVisibility(View.INVISIBLE);
                        binding.cardView.setVisibility(View.INVISIBLE);
                        binding.buttonNext.setVisibility(View.INVISIBLE);
                        binding.Points.setVisibility(View.VISIBLE);
                        binding.Points.append(String.valueOf(punkty) + " punktów");
                    }
                }

        });







    }




}