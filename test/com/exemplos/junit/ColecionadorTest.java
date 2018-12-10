package com.exemplos.junit;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ColecionadorTest {


    @Test
    public void testCarroComAnoDeLancamentoMaisAntigo(){

        String nome;
        Colecionador colecionadorMaster = new Colecionador("Paulo Melo");

        Carro carro1 = new Carro("Mustang","Ford",1994, LocalDate.now());
        Carro carro2 = new Carro("Enzo","Ferrari",2012, LocalDate.now());
        Carro carro3 = new Carro("Mustang","Ford",1994, LocalDate.now());

        colecionadorMaster.getColecao().add(carro1);
        colecionadorMaster.getColecao().add(carro2);
        colecionadorMaster.getColecao().add(carro3);

        Assert.assertEquals(1994,colecionadorMaster.obterAnoDoCarroMaisAintigo());
       // int ano = colecionadorMaster.obterAnoDoCarroMaisAintigo();


    }
}
