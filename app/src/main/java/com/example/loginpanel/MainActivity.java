package com.example.loginpanel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button giris,vazgec;
EditText kul,parola;
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giris=findViewById(R.id.giris);
        vazgec=findViewById(R.id.vazgec);
        kul=findViewById(R.id.kul);
        parola=findViewById(R.id.parola);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kul.getText().toString().equalsIgnoreCase("admin") && parola.getText().toString().equalsIgnoreCase("1234")){
                    Toast.makeText(context,"Giriş Başarılı",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(context,"Yanlış Giriş",Toast.LENGTH_LONG).show();
                }
            }
        });
        vazgec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kul.setText("");
                parola.setText("");
            }
        });
    }

}