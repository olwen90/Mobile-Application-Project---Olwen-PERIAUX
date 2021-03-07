package com.example.mybankapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button1;
    private String Name = "id";
    private String Password = "password";
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText t = findViewById(R.id.editTextTextPassword);
                EditText t2 = findViewById(R.id.editTextTextPassword2);
                String inputname = t2.getText().toString();
                String inputpassword = t.getText().toString();

                if (inputname.isEmpty() || inputpassword.isEmpty()){
                    CharSequence c = "please enter all the details correctly";
                    Toast.makeText(MainActivity.this, c,  Toast.LENGTH_LONG).show();
                }
                else{
                    validate(inputname,inputpassword);
                }
            }
        });
    }

    private void validate(String name, String password){
        if (name.equals(Name) && password.equals(Password)){
            CharSequence c = "login successful";
            Toast.makeText(MainActivity.this, c,  Toast.LENGTH_SHORT).show();
            openActivity2();
        }
        else{
            counter--;
            CharSequence c = "wrong data entered";
            Toast.makeText(MainActivity.this, c,  Toast.LENGTH_LONG).show();
            if(counter ==0){
                button1.setEnabled(false);
            }

        }

    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}