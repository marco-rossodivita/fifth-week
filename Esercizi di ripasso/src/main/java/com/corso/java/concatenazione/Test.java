package com.corso.java.concatenazione;

public class Test {

    public static void main(String[] args) {
        Concatenazione c = new Concatenazione("prova", "test");
        System.out.println(c.concatenate());

        Concatenazione c1 = new Concatenazione("secondo","esempio");
        System.out.println(c1.conc());
    }
}
