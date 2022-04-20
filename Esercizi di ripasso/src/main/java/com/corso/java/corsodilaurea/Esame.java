package com.corso.java.corsodilaurea;

import java.util.Scanner;

public class Esame {

    private String nome;
    private int crediti;
    private int voto;

    public Esame() {
    }

    public Esame(String nome, int crediti) {
        this.nome = nome;
        this.crediti = crediti;
        this.voto = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrediti() {
        return crediti;
    }

    public void setCrediti(int crediti) {
        this.crediti = crediti;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }


    @Override
    public String toString() {
        return "Esame{" +
                "nome='" + nome + '\'' +
                ", crediti=" + crediti +
                ", voto=" + voto +
                '}';
    }

    public void readEsame(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci nome esame: ");
        this.nome = sc.nextLine();

        System.out.println("Inserisci crediti esame: ");
        String cred  = sc.nextLine();
        this.crediti = Integer.parseInt(cred);

        System.out.println("Inserisci voto esame: ");
        String v = sc.nextLine();
        this.voto = Integer.parseInt(v);

    }
}
