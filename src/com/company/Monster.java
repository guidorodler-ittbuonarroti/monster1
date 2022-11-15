package com.company;

public class Monster {
    String nome;
    int punti_vita;
    int attacco;

    boolean vivo;
    //metodi
    Monster(String nome,int punti_vita,int attacco){
        this.nome=nome;
        this.punti_vita=punti_vita;
        vivo=true;
    }
    public int attacca(){
        return attacco;
    }
    public void subisci( int danno){
        punti_vita=punti_vita-danno;
    }
    public  String toString(){
        return ("il mostro"+ nome+" ha"+punti_vita+"e infligge un danno pari a"+attacco+"a ogni colpo");
    }
    public boolean getVita(){
        return  vivo;
    }
}
