package com.binger.purdue.binger15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class LogIn extends AppCompatActivity {
    Button button4 = (Button) findViewById(R.id.button4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText5 = (EditText) findViewById(R.id.editText5);
                String username = editText5.getText().toString();

                EditText editText6 = (EditText) findViewById(R.id.editText6);
                String email = editText6.getText().toString();


                if (editText5.getText().toString().equals("username") && editText6.getText().toString().equals("password")) {

                    button4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //openSchedule();
                        }
                    });

                } else {
                    System.out.println("no");
                }


            }
        });
    }


//    public void openSchedule(){
//        Intent intent = new Intent(this, Schedule.class);
//        startActivity(intent);
//    }
}