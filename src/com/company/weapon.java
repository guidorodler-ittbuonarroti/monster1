package com.company;

public class weapon {
    int danno;
    String nome;
    //
    weapon(int danno,String nome){
        this.nome=nome;
        this.danno=danno;
    }
    weapon(weapon arma){
        this.nome=arma.getNome();
        this.danno=arma.getDanno();
    }
    public int getDanno(){
        return danno;
    }
    public String getNome(){
        return nome;
    }
}
