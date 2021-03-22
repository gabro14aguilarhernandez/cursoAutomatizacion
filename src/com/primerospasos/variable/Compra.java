package com.primerospasos.variable;

public class Compra {

    public static void main (String args []){


        Ferreteria compraUno = new Ferreteria("laminasAsbesto",false);

        System.out.println("su compra uno es: " + compraUno.laminas + " " + compraUno.tipoHerramientas + " " + compraUno.papeleria);

        Ferreteria compraDos = new Ferreteria();

        System.out.println("su compra dos es: " + compraDos.laminas +" " + compraDos.maquinaRefresco +" " + compraDos.papeleria);


    }


}
