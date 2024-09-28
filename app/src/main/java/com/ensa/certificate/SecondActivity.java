package com.ensa.certificate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView reponse1,reponse2;
    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        reponse1=findViewById(R.id.reponseun);
        reponse2=findViewById(R.id.reponsedeux);
        retour=findViewById(R.id.button);
        reponse1.setText(this.getIntent().getStringExtra("reponse une"));
        reponse2.setText(this.getIntent().getStringExtra("reponse deux"));
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}