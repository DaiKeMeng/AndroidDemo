package com.example.supermeng.togglebuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton togBtn;
    Switch switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        togBtn = (ToggleButton)findViewById(R.id.togBtn);
        switcher = (Switch)findViewById(R.id.switchBtn);
        final LinearLayout test = (LinearLayout)findViewById(R.id.test);
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    test.setOrientation(1);
                    togBtn.setChecked(true);
                    switcher.setChecked(true);
                }else {
                    test.setOrientation(0);
                    togBtn.setChecked(false);
                    switcher.setChecked(false);
                }
            }
        };
        togBtn.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);
    }
}
