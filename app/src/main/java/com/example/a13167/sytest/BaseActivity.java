package com.example.a13167.sytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 13167 on 2019/10/4.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Destory.activities.add(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Destory.removeActivity(this);
    }
}
