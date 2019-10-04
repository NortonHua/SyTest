package com.example.a13167.sytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Button button1= (Button) findViewById(R.id.button1);
        Button button2= (Button) findViewById(R.id.button2);

        //为按钮1添加监听事件
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data="Two";
                Intent intent=new Intent(OneActivity.this,TwoActivity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent);
            }
        });

        //为按钮二添加监听事件
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OneActivity.this,ThreeActivity.class);
                startActivity(intent);
            }
        });

    }
}
