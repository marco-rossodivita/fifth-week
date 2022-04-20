package com.corso.java;

public class InsiemeDiStringhe {

    private String[] arr;
    private int n=0;
    private int max;

    public InsiemeDiStringhe() {
    }

    public InsiemeDiStringhe(int max) {
        this.arr=new String[max];
        this.n = max;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    /**
     *
     * @return - stringa di lunghezza massima
     */
    public String stringaLunga(){

        int max = 0;
        String temp = "";

        for(int i =0; i < this.max; i++) {
            if (arr[i].length() > max) {
                temp = arr[i];
                max = arr[i].length();
            }
        }

        return temp;
    }


    /**
     * Stringa con più spazi
     */
    public String spaziStringa(){
        String temp="nessuna stringa con spazi";
        int i, j;
        int spazi,spazimax=0;
        System.out.println();
        for(i=0;i < arr.length;i++) {
            spazi=0;
            for(j=0;j < arr[i].length();j++)
                if(arr[i].charAt(j)==' ')spazi++;
            if(spazi > spazimax){
                spazimax=spazi;
                temp=arr[i];
            }
        }
        return temp;

    }

    /**
     *
     * @param prefisso
     */
    public void preStringa(String prefisso) {

    }
}
