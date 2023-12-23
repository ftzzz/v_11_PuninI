package com.example.punin_v_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    // Other button and view declarations

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button button = findViewById(R.id.loginButton); // Предположим, что у вас есть кнопка с id "button" на вашем макете (layout)

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем намерение (Intent) для перехода на другую активность
                Intent intent = new Intent(MainActivity.this, PersonalAreaActivity.class);
                startActivity(intent); // Запускаем активность
            }
        });
    }

    public void openPersonalArea() {
        Intent intent = new Intent(this, PersonalAreaActivity.class);
        startActivity(intent);
    }

}
