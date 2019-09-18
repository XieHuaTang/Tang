package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //定义组件全局变量
    TextView tv_one;
    Button bt_jia,bt_jian,bt_cheng,bt_chu;
    Button bt_0,bt_1,bt_2,bt_3,bt_4,bt_5,bt_6,bt_7,bt_8,bt_9;
    Button bt_tui,bt_qing,bt_dian,bt_deng;

    //继承了Activity抽象类，需要重写其抽象方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取组件对象
        bt_0=findViewById(R.id.bt_0);
        bt_1=findViewById(R.id.bt_1);
        bt_2=findViewById(R.id.bt_2);
        bt_3=findViewById(R.id.bt_3);
        bt_4=findViewById(R.id.bt_4);
        bt_5=findViewById(R.id.bt_5);
        bt_6=findViewById(R.id.bt_6);
        bt_7=findViewById(R.id.bt_7);
        bt_8=findViewById(R.id.bt_8);
        bt_9=findViewById(R.id.bt_9);
        bt_jia=findViewById(R.id.bt_jia);
        bt_jian=findViewById(R.id.bt_jian);
        bt_cheng=findViewById(R.id.bt_cheng);
        bt_chu=findViewById(R.id.bt_chu);
        bt_dian=this.findViewById(R.id.bt_dian);
        bt_deng=this.findViewById(R.id.bt_deng);
        bt_tui=this.findViewById(R.id.bt_tui);
        bt_qing=this.findViewById(R.id.bt_qing);
        tv_one=this.findViewById(R.id.tv_one);

        //为组件添加监听器
        tv_one.setOnClickListener(this);
        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        bt_jia.setOnClickListener(this);
        bt_jian.setOnClickListener(this);
        bt_cheng.setOnClickListener(this);
        bt_chu.setOnClickListener(this);
        bt_dian.setOnClickListener(this);
        bt_tui.setOnClickListener(this);
        bt_qing.setOnClickListener(this);
        bt_deng.setOnClickListener(this);
    }
    //重写监听器的抽象方法
    @Override
    public void onClick(View v){
    }
}
