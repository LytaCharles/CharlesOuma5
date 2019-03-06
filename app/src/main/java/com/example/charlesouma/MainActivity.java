package com.example.charlesouma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


    public void myfirstbutton(View view){

        EditText  passwordText = (EditText) findViewById(R.id.edittextpassword);

        Toast.makeText(MainActivity.this, passwordText.getText().toString(), Toast.LENGTH_SHORT).show();


    }







}
