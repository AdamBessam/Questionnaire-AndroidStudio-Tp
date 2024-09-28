package com.ensa.certificate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class FirstActivity extends AppCompatActivity {

    private Button quitter,suivant;
    private String reponse1,reponse2;
    private RadioButton un,deux,trois,quatre,oui,non;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        quitter=findViewById(R.id.quitter);
        suivant=findViewById(R.id.suivant);
        un=findViewById(R.id.un);
        deux=findViewById(R.id.deux);
        trois=findViewById(R.id.trois);
        quatre=findViewById(R.id.quatre);
        oui=findViewById(R.id.oui);
        non=findViewById(R.id.non);

        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(un.isChecked()){
                    reponse1=un.getText().toString();

                } else if (deux.isChecked()) {
                    reponse1=deux.getText().toString();

                } else if (trois.isChecked()) {
                    reponse1=trois.getText().toString();

                } else if (quatre.isChecked()) {
                    reponse1=quatre.getText().toString();

                }
                if(oui.isChecked()){
                    reponse2=oui.getText().toString();
                } else if (non.isChecked()) {
                    reponse2=non.getText().toString();

                }
                Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("reponse une",reponse1);
                intent.putExtra("reponse deux",reponse2);

                startActivity(intent);
                RadioButton[]  buttons={un,deux,trois,quatre,oui,non};
                for(RadioButton radio:buttons){
                    radio.setChecked(false);
                }


            }
        });
    }
}