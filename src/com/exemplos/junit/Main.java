package com.exemplos.junit;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String nome;
        Colecionador colecionadorMaster = new Colecionador("Paulo Melo");

        Carro carro1 = new Carro("Mustang","Ford",1994, LocalDate.now());
        Carro carro2 = new Carro("Enzo","Ferrari",2012, LocalDate.now());
        Carro carro3 = new Carro("Mustang","Ford",1994, LocalDate.now());

        colecionadorMaster.getColecao().add(carro1);
        colecionadorMaster.getColecao().add(carro2);
        colecionadorMaster.getColecao().add(carro3);

        int ano = colecionadorMaster.obterAnoDoCarroMaisAintigo();

        System.out.println("Ano do carro mais antito:"+ ano);

    }



}
