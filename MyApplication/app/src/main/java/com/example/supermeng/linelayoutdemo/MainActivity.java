package com.example.supermeng.linelayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] chars = {
            "7","8","9","+",
            "4","5","6","-",
            "1","2","3","*",
            ".","0","=","/"
    };

    GridLayout gridLayout;
    // 计算下标
    int index = 0 ;
    // 第一个计算数
    String fir_count = "";
    // 第二个计算数
    String sec_count = "";
    // 整体显示的数字
    String contentStr = new String();
    // 判断是不是第二个参数
    boolean isNextCount = false;
//    // 是不是等号后的继续算值
//    boolean isGoOnCount = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout);
        gridLayout=(GridLayout)findViewById(R.id.root);

        for (int i = 0 ; i < chars.length ; i++){
            Button btn = new Button(this);
            btn.setId(i);
            btn.setText(chars[i]);
            btn.setTextSize(40);
//            btn.setOnClickListener(this);

            btn.setPadding(5,35,5,35);
            // 下面两句是决定当前创建的Btn的位置
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            // 指定布局的属性
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,columnSpec);
            gridLayout.addView(btn,params);
        }
//        公用一个方法来集合所有的BTN的点击事件
//        findViewById(R.id.clean_btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                contentStr = "";
//            }
//        });
    }
    // 集合所有的btn的点击方法
    @Override
    public void onClick(View v) {
        index=v.getId();
        Log.d("btnID", String.valueOf(index));
        switch (index){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
        }
    }

//    // 计算结果 (+,—,*,=,/ 号的功能)
//    public void onResoultCount(){
//
//    }
}
