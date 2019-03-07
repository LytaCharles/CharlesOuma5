package com.example.charlesouma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    EditText  usernameText;

    EditText passwordText;

    EditText confirmPasswordText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


    public void myfirstbutton(View view){

        EditText   usernameText = (EditText) findViewById(R.id.edittextusername);
        EditText  passwordText = (EditText) findViewById(R.id.edittextpassword);
        EditText  confirmPasswordText = (EditText)  findViewById(R.id.edittextconfirmpassword);

        Toast.makeText(MainActivity.this, usernameText.getText().toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, passwordText.getText() .toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, confirmPasswordText.getText() .toString(), Toast.LENGTH_SHORT).show();


    }







}
