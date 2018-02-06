package com.hongfans.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNIUtil util = new JNIUtil();
        TextView text = findViewById(R.id.tv_main);
        text.setText(util.getWorld());

        TextView more = findViewById(R.id.tv_more);
        more.setText(JNIUtil.getHello());
    }
}
