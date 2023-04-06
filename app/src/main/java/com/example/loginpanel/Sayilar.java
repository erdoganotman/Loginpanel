package com.example.loginpanel;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sayilar extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayilardizi);
        txt=findViewById(R.id.txt);
        Resources res=this.getResources();
        int num[]=res.getIntArray(R.array.dizi);
        int toplam=0;
        for (int i=0;i<num.length;i++){
            toplam+=num[i];

        }
        txt.setText("Toplam ="+toplam);
    }
}
