package com.company;

public class Monster {
    String nome;
    int punti_vita;
    int danno;
    //metodi
    Monster(String nome,int punti_vita){
        this.nome=nome;
        this.punti_vita=punti_vita;
    }
    public int attacca(){
        return danno;
    }
    public String subisci(){
        punti_vita=punti_vita-danno;
        return "danno subito";
    }
    public  String toString(){
        return ("il mostro ha"+punti_vita+"e subisce un danno pari a"+danno+"a ogni colpo");
    }

}
