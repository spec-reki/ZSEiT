package com.example.loginappas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button zatwierdzPrzycisk;
    private EditText haslo1;
    private EditText haslo2;
    private EditText poleEmail;
    private TextView polePowiadomien;

    private String email;
    private String haslo;

    private View.OnClickListener zatwierdzPrzyciskListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            email = poleEmail.getText().toString();
            boolean hasAt = false;
            for (int i = email.length() - 1; i > 0; i--) {
                if (email.charAt(i) == '@') {
                    hasAt = true;
                    break;
                }
            }

            if (!hasAt) polePowiadomien.setText("Nieprawidłowy adres email");

            if (hasAt) {
                if (haslo1.getText().toString().equals(haslo2.getText().toString())) {
                    haslo = haslo1.getText().toString();
                    polePowiadomien.setText("Witaj " + email);
                } else {
                    polePowiadomien.setText("Hasła się różnią.");
                }
            }
        }
    };
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            polePowiadomien = findViewById(R.id.powiadomienia);
            polePowiadomien.setText("Autor: 2002002XXXX");

            poleEmail = findViewById(R.id.polemail);
            haslo1 = findViewById(R.id.haslo1);
            haslo2 = findViewById(R.id.haslo2);

            zatwierdzPrzycisk = findViewById(R.id.zatwierdz);
            zatwierdzPrzycisk.setOnClickListener(zatwierdzPrzyciskListener);
        }
    };



