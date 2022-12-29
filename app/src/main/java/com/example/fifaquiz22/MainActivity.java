package com.example.fifaquiz22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView question;
    Button yes,no;

    private String[] questions={"Messi assists 3 goal in 2022 world cup","Luka Modric is the captain of Croatia in 2022 world cup",
                                 "Kylian Mbappe scored 9 goals in the 2022 world cup","Messi got 1 yellow card in 2022 world cup","Thiago Silva is the captain of Brazil football team"};
    private boolean[] answers={true,true,false,true,true};
    int index=0;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question=findViewById(R.id.questions);
        yes=findViewById(R.id.yesBtn);
        no=findViewById(R.id.noBtn);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index<=questions.length-1){
                    if (answers[index]==true){
                        score++;
                    }
                    index++;
                    if (index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: "+score, Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index<=questions.length-1){
                    if (answers[index]==true){
                        score++;
                    }
                    index++;
                    if (index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: "+score, Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

    }
}