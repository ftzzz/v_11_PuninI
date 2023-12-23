package com.example.punin_v_11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    Switch settingsSwitch;
    Switch settings1Switch;
    Switch settings2Switch;
    Button resetSettingsButton;
    Button reset1SettingsButton;
    Button reset2SettingsButton;
    // Other button, switch, and view declarations

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        settingsSwitch = findViewById(R.id.settingsSwitch);
        resetSettingsButton = findViewById(R.id.resetButton);

        settings1Switch = findViewById(R.id.settings1Switch);
        reset1SettingsButton = findViewById(R.id.resetButton);

        settings2Switch = findViewById(R.id.settings2Switch);
        reset2SettingsButton = findViewById(R.id.resetButton);
        // Other button, switch, and view initializations

        resetSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsSwitch.setChecked(false);
                // Other settings reset actions
            }
        });
        reset1SettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settings1Switch.setChecked(false);
                // Other settings reset actions
            }
        });
        reset2SettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settings2Switch.setChecked(false);
                // Other settings reset actions
            }
        });
    }
}
