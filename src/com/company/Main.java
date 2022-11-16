package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Monster mostro1;
            Monster mostro2;
            weapon arma;
            arma=new weapon(4,"alabarda");
            Scanner input=new Scanner(System.in);
            int N_attacchi;
            int vita;
            int attacco;
            String nome;
            System.out.println("inserisci il nome del primo mostro:");
            nome=input.nextLine();
            input=new Scanner(System.in);
            System.out.println("inserisci la Vita del primo mostro:");
            vita=input.nextInt();
            System.out.println("inserisci i danni che il primo mostro infligge ad ogni attacco:");
            attacco=input.nextInt();
            input=new Scanner(System.in);
            mostro1=new Monster(nome,vita,attacco,arma);
            System.out.println("inserisci il nome del secondo mostro:");
            nome=input.nextLine();
            input=new Scanner(System.in);
            System.out.println("inserisci la Vita del secondo mostro:");
            vita=input.nextInt();
            System.out.println("inserisci i danni che il secondo mostro infligge ad ogni attacco:");
            attacco=input.nextInt();
            mostro2=new Monster(nome,vita,attacco,arma);
            System.out.println("inserisci il numero di attacchi da fare:");
            N_attacchi=input.nextInt();
            int i =0;
            while (i < N_attacchi && mostro1.getVita() && mostro2.getVita()){
                mostro1.subisci(mostro2.attacca());
                mostro2.subisci(mostro1.attacca());
            }
            if (mostro1.getVita()){
                System.out.println("ha vinto il mostro 1");
            }else {
                System.out.println("ha vinto il mostro 2");
            }
    }
}
