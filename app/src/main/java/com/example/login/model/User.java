package com.example.login.model;

public class User {

    private String userName;
    private String password;

    public User(String nome, String senha){
        this.userName = nome;
        this.password = senha;
    }

    public boolean checking(String nome, String senha ){
        return (nome.equals("Nathalia")  && senha.equals("1234") );
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }

}
