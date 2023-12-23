package com.example.punin_v_11;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;

public class SystemPhoneActivity extends AppCompatActivity {


        private TextView phoneNumberTextView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.system_phone);

            phoneNumberTextView = findViewById(R.id.phoneNumberTextView);

            Button buttonOne = findViewById(R.id.buttonOne);
            buttonOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    appendDigit("1");
                }
            });

            // Обработка нажатий на другие кнопки с цифрами

            Button deleteButton = findViewById(R.id.deleteButton);
            deleteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    deleteLastDigit();
                }
            });

            Button confirmButton = findViewById(R.id.confirmButton);
            confirmButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    confirmNumber();
                }
            });
        }

        private void appendDigit(String digit) {
            String currentNumber = phoneNumberTextView.getText().toString();
            phoneNumberTextView.setText(currentNumber + digit);
        }

        private void deleteLastDigit() {
            String currentNumber = phoneNumberTextView.getText().toString();
            if (currentNumber.length() > 0) {
                phoneNumberTextView.setText(currentNumber.substring(0, currentNumber.length() - 1));
            }
        }

        private void confirmNumber() {
            String phoneNumber = phoneNumberTextView.getText().toString();
            // Действия при подтверждении номера, например, отправка SMS или звонок
        }

    }
