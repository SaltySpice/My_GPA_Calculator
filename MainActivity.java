package com.example.gpa_labas1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText grade1, grade2, grade3, grade4, grade5;
    TextView text_msg;

    int count = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        grade1 = (EditText) findViewById(R.id.grade1);
        grade2 = (EditText) findViewById(R.id.grade2);
        grade3 = (EditText) findViewById(R.id.grade3);
        grade4 = (EditText) findViewById(R.id.grade4);
        grade5 = (EditText) findViewById(R.id.grade5);
        text_msg = (TextView) findViewById(R.id.text_msg);
        text_msg.setBackgroundColor(Color.WHITE);

        // When you start typing in the fields again after the first GPA calculation,
        // change back the button text to show compute GPA.

        EditText c1 = findViewById(R.id.grade1);
        EditText c2 = findViewById(R.id.grade2);
        EditText c3 = findViewById(R.id.grade3);
        EditText c4 = findViewById(R.id.grade4);
        EditText c5 = findViewById(R.id.grade5);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApplicationContext();
                btn.setText("Compute GPA");
                text_msg.setBackgroundColor(Color.WHITE);
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApplicationContext();
                btn.setText("Compute GPA");
                text_msg.setBackgroundColor(Color.WHITE);
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApplicationContext();
                btn.setText("Compute GPA");
                text_msg.setBackgroundColor(Color.WHITE);
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApplicationContext();
                btn.setText("Compute GPA");
                text_msg.setBackgroundColor(Color.WHITE);
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApplicationContext();
                btn.setText("Compute GPA");
                text_msg.setBackgroundColor(Color.WHITE);
                getWindow().getDecorView().setBackgroundColor(Color.WHITE);
            }
        });

        // Ensure there are no empty fields.

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double val1, val2, val3, val4, val5;

                if (count % 2 == 0) {
                    // Assure no empty fields.
                    if (grade1.getText().toString().equals("") ||
                            grade2.getText().toString().equals("") ||
                            grade3.getText().toString().equals("") ||
                            grade4.getText().toString().equals("") ||
                            grade5.getText().toString().equals("")) {

                        Toast.makeText(getApplicationContext(), "All fields need to be filled.", Toast.LENGTH_SHORT).show();

                    } else {
                        val1 = Float.parseFloat(grade1.getText().toString());
                        val2 = Float.parseFloat(grade2.getText().toString());
                        val3 = Float.parseFloat(grade3.getText().toString());
                        val4 = Float.parseFloat(grade4.getText().toString());
                        val5 = Float.parseFloat(grade5.getText().toString());
                        double gpa = val1 + val2 + val3 + val4 + val5;
                        gpa = gpa / 5;


                        // If GPA less than 60, Red background is shown.
                        if (gpa < 60) {
                            text_msg.setText(Double.toString(gpa));
                            text_msg.setBackgroundColor(Color.RED);
                            getWindow().getDecorView().setBackgroundColor(Color.RED);
                            // Yellow background for GPA of 61-79.
                        } else if (gpa > 60 && gpa < 80) {
                            text_msg.setText(Double.toString(gpa));
                            text_msg.setBackgroundColor(Color.YELLOW);
                            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                            // Green background for GPA of 80 to 100.
                        } else if (gpa >= 80 && gpa <= 100) {
                            text_msg.setText(Double.toString(gpa));
                            text_msg.setBackgroundColor(Color.GREEN);
                            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        }
                        count++;
                        btn.setText("Clear form");
                    }

                } else {
                    grade1.setText("");
                    grade2.setText("");
                    grade3.setText("");
                    grade4.setText("");
                    grade5.setText("");
                    text_msg.setText("");
                    btn.setText("Compute GPA");
                    text_msg.setBackgroundColor(Color.WHITE);
                    getWindow().getDecorView().setBackgroundColor(Color.WHITE);
                    count++;

                }
            }
        });

    }
}
