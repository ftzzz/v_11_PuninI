package com.example.punin_v_11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class PersonalAreaActivity extends AppCompatActivity {

    Button backToLoginButton, settingsButton, systemssButton;
    // Other button and view declarations

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);

        backToLoginButton = findViewById(R.id.backButton);
        settingsButton = findViewById(R.id.settingsButton);
        systemssButton = findViewById(R.id.systembutton);

        backToLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });

        systemssButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Создаем намерение (Intent) для перехода на другую активность
                    Intent intent = new Intent(PersonalAreaActivity.this, SystemPhoneActivity.class);
                    startActivity(intent); // Запускаем активность
                }
            });
        }




    public void openSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}

