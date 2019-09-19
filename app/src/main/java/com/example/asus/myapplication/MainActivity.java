package com.example.asus.myapplication;

import android.graphics.Color;
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
    int tang,tang1;//标记变量
    String strone;
    String strtwo;

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
        bt_dian=findViewById(R.id.bt_dian);
        bt_deng=findViewById(R.id.bt_deng);
        bt_tui=findViewById(R.id.bt_tui);
        bt_qing=findViewById(R.id.bt_qing);
        tv_one=findViewById(R.id.tv_one);
        tang=0;

        //为组件添加监听器
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

    //重写监听器接口的抽象方法
    @Override
    public void onClick(View v) {//姑且理解为焦点对象
        int n=v.getId();
        String str=tv_one.getText().toString();
        String str2=((Button)v).getText().toString();
        switch (n){
            case R.id.bt_0:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_1:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_2:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_3:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_4:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_5:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_6:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_7:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_8:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_9:
                if(tang!=0){
                    str="0";
                    tang=0;
                }
                if(str.equals("0")){
                    tv_one.setText(str2);
                }else tv_one.setText(str+str2);break;
            case R.id.bt_dian:
                if(str.contains(".")){//contains()方法，当且仅当此字符串包含指定的char值序列时，返回true
                }else tv_one.setText(str+str2);break;
            case R.id.bt_jia:
                tang=1;
                tang1=1;
                strone=tv_one.getText().toString();
                bt_jia.setTextColor(Color.rgb(255,165,0));
                bt_jia.setBackgroundColor(Color.rgb(255,255,255));

                bt_jian.setTextColor(Color.rgb(255,255,255));
                bt_jian.setBackgroundColor(Color.rgb(255,165,0));
                bt_cheng.setTextColor(Color.rgb(255,255,255));
                bt_cheng.setBackgroundColor(Color.rgb(255,165,0));
                bt_chu.setTextColor(Color.rgb(255,255,255));
                bt_chu.setBackgroundColor(Color.rgb(255,165,0));
                break;
            case R.id.bt_jian:
                tang=2;
                tang1=2;
                strone=tv_one.getText().toString();
                bt_jian.setTextColor(Color.rgb(255,165,0));
                bt_jian.setBackgroundColor(Color.rgb(255,255,255));

                bt_jia.setTextColor(Color.rgb(255,255,255));
                bt_jia.setBackgroundColor(Color.rgb(255,165,0));
                bt_cheng.setTextColor(Color.rgb(255,255,255));
                bt_cheng.setBackgroundColor(Color.rgb(255,165,0));
                bt_chu.setTextColor(Color.rgb(255,255,255));
                bt_chu.setBackgroundColor(Color.rgb(255,165,0));
                break;
            case R.id.bt_cheng:
                tang=3;
                tang1=3;
                strone=tv_one.getText().toString();
                bt_cheng.setTextColor(Color.rgb(255,165,0));
                bt_cheng.setBackgroundColor(Color.rgb(255,255,255));

                bt_jia.setTextColor(Color.rgb(255,255,255));
                bt_jia.setBackgroundColor(Color.rgb(255,165,0));
                bt_jian.setTextColor(Color.rgb(255,255,255));
                bt_jian.setBackgroundColor(Color.rgb(255,165,0));
                bt_chu.setTextColor(Color.rgb(255,255,255));
                bt_chu.setBackgroundColor(Color.rgb(255,165,0));
                break;
            case R.id.bt_chu:
                tang=4;
                tang1=4;
                strone=tv_one.getText().toString();
                bt_chu.setTextColor(Color.rgb(255,165,0));
                bt_chu.setBackgroundColor(Color.rgb(255,255,255));

                bt_jia.setTextColor(Color.rgb(255,255,255));
                bt_jia.setBackgroundColor(Color.rgb(255,165,0));
                bt_cheng.setTextColor(Color.rgb(255,255,255));
                bt_cheng.setBackgroundColor(Color.rgb(255,165,0));
                bt_jian.setTextColor(Color.rgb(255,255,255));
                bt_jian.setBackgroundColor(Color.rgb(255,165,0));
                break;
            case R.id.bt_qing:
                Tang();
                tv_one.setText("0");break;
            case R.id.bt_tui:
                double x=Double.parseDouble(str);//考虑到有小数点，得用double
                //substring() 方法用于提取字符串中介于两个指定下标之间的字符
                if(x<=9){
                    tv_one.setText("0");
                }else tv_one.setText(str.substring(0,str.length()-1));break;
            case R.id.bt_deng:
                Compute();break;
        }
    }
    public void Compute(){
        strtwo=tv_one.getText().toString();
        double a=Double.parseDouble(strone);
        double b=Double.parseDouble(strtwo);
        switch (tang1){
            case 1:
                Tang();
                double c1=a+b;
                tv_one.setText(c1+"");break;//任何字符与字符串相加结果都是拼接为字符串
            case 2:
                Tang();
                double c2=a-b;
                tv_one.setText(c2+"");break;
            case 3:
                Tang();
                double c3=a*b;
                tv_one.setText(c3+"");break;
            case 4:
                Tang();
                double c4=a/b;
                tv_one.setText(c4+"");break;
        }
    }
    public void Tang(){
        tang1=0;
        tang=5;
        bt_jia.setTextColor(Color.rgb(255,255,255));
        bt_jia.setBackgroundColor(Color.rgb(255,165,0));
        bt_cheng.setTextColor(Color.rgb(255,255,255));
        bt_cheng.setBackgroundColor(Color.rgb(255,165,0));
        bt_jian.setTextColor(Color.rgb(255,255,255));
        bt_jian.setBackgroundColor(Color.rgb(255,165,0));
        bt_chu.setTextColor(Color.rgb(255,255,255));
        bt_chu.setBackgroundColor(Color.rgb(255,165,0));
    }
}
