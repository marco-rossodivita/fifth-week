package com.corso.java.corsodilaurea;

import java.util.ArrayList;
import java.util.Random;

public class CorsoLaurea {

    private String nome;
    private ArrayList<Studente> immatricolati;

    public static int prossimaMatricola;
    public static final int MIN_CREDITI = 30 ;

    public CorsoLaurea(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param unNomeStudente
     */
    public void iscrivi(String unNomeStudente){
        prossimaMatricola++;
        immatricolati.add(new Studente(nome,prossimaMatricola));
    }

    /**
     *
     * @param unNomeStudente
     */
    public void ritira(String unNomeStudente){
        for(Studente s: immatricolati){
            if(s.getNome().equalsIgnoreCase(unNomeStudente)){
                immatricolati.remove(s);
            }
        }

        return;

    }

    /**
     *
     * @param unNomeEsame
     * @param iscritti
     */
    public void appello(String unNomeEsame, ArrayList<Studente> iscritti){

    }

    /**
     * Tutti gli studenti che hanno totalizzato almeno 30 crediti verranno eliminati
     */
    public void laurea(){

        int i = 0;
        while (i<immatricolati.size())
        {
            if (immatricolati.get(i).crediti() >= MIN_CREDITI)
                immatricolati.remove(i);
            i++;
        }
    }
}
