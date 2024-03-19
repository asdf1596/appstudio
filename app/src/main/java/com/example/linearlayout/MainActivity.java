package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_info);

        Button preViewButton = findViewById(R.id.prevButton);
        Button nextButton = findViewById(R.id.nextButton);
        //1. 버튼에 클릭 이벤트 리스너를 등록하는 방법
        preViewButton.setOnClickListener(this);
        //2.버튼에 익명클래스로 이벤트 리스너 처리
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("익명클래스로 이벤트 처리", "nextButton 클릭");
                Toast.makeText(MainActivity.this, "nextButton 클릭", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Log.d("버튼에 이벤트 리스너 등록", "preViewButton 클릭");
        Toast.makeText(this, "preViewButton 버튼 클릭", Toast.LENGTH_SHORT).show();
    }
}