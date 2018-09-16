package com.binger.purdue.binger15;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);




        Button button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText);
                String username = editText1.getText().toString();

                EditText editText2 = (EditText) findViewById(R.id.editText2);
                String email = editText2.getText().toString();

                EditText editText3 = (EditText) findViewById(R.id.editText3);
                String password = editText3.getText().toString();
                Map<String, String> attr = new HashMap<>();
                attr.put("username", username);
                attr.put("email", email);
                attr.put("password", password);
                DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
                mDatabase.child("users").child("1").setValue(attr);
                System.out.println("GOT HERE");


            }
        });
    }
}
