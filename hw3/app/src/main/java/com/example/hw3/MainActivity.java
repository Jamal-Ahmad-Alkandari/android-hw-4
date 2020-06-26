package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText quizes = findViewById(R.id.Quizes);
        final EditText homework = findViewById(R.id.Homework);
                final EditText midterms = findViewById(R.id.MidTerms);
        final EditText finals = findViewById(R.id.finals);
        Button   calculate = findViewById(R.id.calculate);
        Button   reset  = findViewById(R.id.reset);

        final TextView  grade = findViewById(R.id.grade);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quizes.setText("");
                homework.setText("");
                midterms.setText("");
                finals.setText("");
                grade.setText("");
            }
        });



        calculate.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             double x = Double.parseDouble(quizes.getText().toString());
             double y = Double.parseDouble(homework.getText().toString());
             double w = Double.parseDouble(midterms.getText().toString());
             double a = Double.parseDouble(finals.getText().toString());

             double cal = x+y+w+a ;

             if (cal >= 90 ){
                 grade.setText("A");
             }

             else if(cal>=80){
                 grade.setText("B");
             }

             else if (cal>=60){
                 grade.setText("c");
             }

             else if (cal<60){
                 grade.setText("F");
             }
         }
     });
    }
}