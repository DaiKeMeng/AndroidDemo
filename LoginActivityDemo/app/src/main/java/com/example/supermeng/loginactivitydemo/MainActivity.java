package com.example.supermeng.loginactivitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText name_et;
    EditText password_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.login_btn).setOnClickListener(this);
        name_et = (EditText)findViewById(R.id.name_et);
        password_et = (EditText)findViewById(R.id.password_et);
//        String str = "123.123";
//        int strInt = Integer.parseInt(str);
//        float flot = Float.parseFloat(str);
    }

    @Override
    public void onClick(View v) {
        if (name_et.getText().toString().equals("xiaoming") &&
                password_et.getText().toString().equals("123456"))
        {
            Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"userName or password error",Toast.LENGTH_SHORT).show();
        }
    }
}
