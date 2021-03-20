package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.login.model.User;

public class MainActivity extends AppCompatActivity {

    private EditText edtUser, edtUserPassword;
    private ImageButton btnIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.edtUser);
        edtUserPassword = findViewById(R.id.edtUserPassword);
        btnIn = findViewById(R.id.btnIn);

    }

    public void login(View v){
        String nome = edtUser.getText().toString();
        String senha = edtUserPassword.getText().toString();

        User user = new User(nome, senha);

        if(user.checking(user.getUserName(), user.getPassword()))
            abrirNovaJanela();
        else
            alerta();
    }

    private void alerta() {
        Toast.makeText(this, "Nome de usuario ou senha incorretos", Toast.LENGTH_SHORT).show();
    }

    private void abrirNovaJanela(){
        Intent novaJanela = new Intent(MainActivity.this, EntradaActivity.class);
        startActivity(novaJanela);
    }
}