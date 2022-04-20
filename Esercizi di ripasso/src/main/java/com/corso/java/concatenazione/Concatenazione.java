package com.corso.java.concatenazione;

public class Concatenazione {

    private String str1;
    private String str2;

    public Concatenazione(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    /**
     * Metodo che restituisce una nuova stringa, risultato della concatenazione
     * delle due stringhe; modalità semplice con il più
     */
    public String concatenate(){
        return (this.getStr1() + this.getStr2());
    }

    /**
     * Implementazione ricorsiva
     * @param
     */
    public String conc(){
        return concRec(0);
    }

    public String concRec(int num){
        if(num == this.str2.length())
            return str1;
        str1 = str1 + str2.substring(num, num+1);
        num++;
        return concRec(num);
    }

}
