package com.example.supermeng.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioGroup rg;
    TextView showTV;
    CheckBox redBox;
    CheckBox blueBox;
    CheckBox blackBox;
    EditText nameET;
    EditText ageET;
    String tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup)findViewById(R.id.rg);
        showTV = (TextView)findViewById(R.id.show);
        redBox = (CheckBox)findViewById(R.id.red);
        blueBox = (CheckBox)findViewById(R.id.blue);
        blackBox = (CheckBox)findViewById(R.id.black);
        nameET = (EditText)findViewById(R.id.name_et);
        ageET = (EditText)findViewById(R.id.age_et);
        redBox.setOnClickListener(this);
        blueBox.setOnClickListener(this);
        blackBox.setOnClickListener(this);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tip = checkedId == R.id.male ? "您的性别是男":"您的性别是女";
            }
        });

        findViewById(R.id.sure).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameET.getText().toString().length() == 0){
                    showTadioAction("请输入姓名");
                }else if (ageET.getText().toString().length() == 0){
                    showTadioAction("请输入年龄");
                }else if (!redBox.isChecked() && !blueBox.isChecked() && ! blackBox.isChecked()){
                  showTadioAction("请选择你喜欢的颜色");
                } else {
                    String colorStr = new String();
                    if (redBox.isChecked()){
                        colorStr = "红色";
                    }else if (blueBox.isChecked()){
                        colorStr = "蓝色";
                    }else if (blackBox.isChecked()){
                        colorStr = "黑色";
                    }
                    showTV.setText(nameET.getText().toString() + ","
                            + ageET.getText().toString()
                            + "岁,"+ tip +",喜欢" + colorStr );
                }
            }
        });
    }

    public void showTadioAction(String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == redBox.getId()){
            redBox.setChecked(true);
            blueBox.setChecked(false);
            blackBox.setChecked(false);

        }else if (v.getId() == blueBox.getId()){

            redBox.setChecked(false);
            blueBox.setChecked(true);
            blackBox.setChecked(false);
        }else if (v.getId() == blackBox.getId()){
            redBox.setChecked(false);
            blueBox.setChecked(false);
            blackBox.setChecked(true);
        }
    }
}
