package com.corso.java.corsodilaurea;

import java.util.ArrayList;
import java.util.Scanner;

public class Studente {

    private String nome;
    private int matricola;
    private ArrayList<Esame> esamiSostenuti; //esami il cui voto ovviamente è stato superiore a 18
    private ArrayList<Esame> pianoStudio;

    public Studente() {
    }

    public Studente(String nome, int matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    /**
     * Aggiunge l'esame, inserito come parametro, al piano di studi dello Studente
     * @param unNomeEsame
     * @param numCrediti
     */
    public void aggiungiEsame(String unNomeEsame, int numCrediti){

        for(Esame e : pianoStudio){
            if(e.getNome().equalsIgnoreCase(unNomeEsame)) {
                pianoStudio.add(new Esame(unNomeEsame, numCrediti));
                System.out.println("L'esame " + unNomeEsame + " di crediti " + numCrediti + " e' stato aggiunto al piano di studi.");
            }
        }
            return;
    }



    /**
     *
     * @param unNomeEsame
     * @param unVoto
     */
    public void promosso(String unNomeEsame, int unVoto){

        for(Esame e: pianoStudio){
            if(e.getNome().equalsIgnoreCase(unNomeEsame)){
                e.setVoto(unVoto);
                esamiSostenuti.add(e);
            }
        }

        return;

    }


    public void cancella(String unNomeEsame){
        for(Esame e: pianoStudio){
            if(e.getNome().equalsIgnoreCase(unNomeEsame)){
                pianoStudio.remove(e);
            }
        }

        for(Esame e :esamiSostenuti){
            esamiSostenuti.remove(e);
        }
    }

    /**
     *
     * @return
     */
    public double media(){

        int somma = 0;

        for(Esame e: esamiSostenuti) {
            somma = somma + e.getVoto();
        }
        double media = somma/esamiSostenuti.size();

        return media;

    }

    /**
     *
     * @return
     */
    public double crediti(){
        int sommaCrediti = 0;
        for(Esame e: esamiSostenuti)
            sommaCrediti = sommaCrediti + e.getCrediti();
        return sommaCrediti;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", matricola=" + matricola +
                ", esamiSostenuti=" + esamiSostenuti +
                ", pianoStudio=" + pianoStudio +
                '}';
    }

    public void readStudente(){

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome studente");
        this.nome = input.next();

        System.out.println("Inserisci il numero di matricola");
        this.matricola = input.nextInt();



    }


}
