package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class EntradaActivity extends AppCompatActivity {

    private Button btnEnviar;
    private Switch switch1;
    private CheckBox checkBox, checkBox2, checkBox3, checkBox4;
    private RadioButton radio1, radio2, radio3;
    private TextView txtResultado;
    ArrayList<String> dadosForm = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

        getSupportActionBar().hide();

        btnEnviar = findViewById(R.id.button);
        switch1 = findViewById(R.id.switch1);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        radio1 = findViewById(R.id.radioButton);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton3);

        txtResultado = findViewById(R.id.txtResultado);

    }

    public void switchBtn(View v){
        if(switch1.isChecked()){
            switch1.setText("Sim");
            dadosForm.add(switch1.getText().toString());
        } else {
            switch1.setText("Não");
            dadosForm.add(switch1.getText().toString());
        }
    }

    public void capturaForm(View v){
        dadosForm.clear();

        if(radio1.isChecked()){
            dadosForm.add(radio1.getText().toString());
        }
        if(radio2.isChecked()){
            dadosForm.add(radio2.getText().toString());
        }
        if(radio3.isChecked()){
            dadosForm.add(radio3.getText().toString());
        }
        if(checkBox.isChecked()){
            dadosForm.add(checkBox.getText().toString());
        }
        if(checkBox2.isChecked()){
            dadosForm.add(checkBox2.getText().toString());
        }
        if(checkBox3.isChecked()){
            dadosForm.add(checkBox3.getText().toString());
        }
        if(checkBox4.isChecked()){
            dadosForm.add(checkBox4.getText().toString());
        }

        txtResultado.setText(dadosForm.toString());

    }
}