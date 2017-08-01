package com.project.classistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_chooseProfile);
        (findViewById(R.id.teacher)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTeacher();
            }
        });
        (findViewById(R.id.student)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToStudent();
            }
        });
    }
    protected void goToTeacher(){

    }
    protected void goToStudent(){

    }
}
