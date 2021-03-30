package com.primerospasos.variable;

public class Ferreteria {

    public String laminas = "" ;
    public String tipoHerramientas = "plomeria";
    public String refacciones = "tuercasRondanas";
    public String construccion = "pegaazulejo";
    public boolean papeleria = true;
    public boolean maquinaRefresco = false;

    private int numEmpleados = 5;
    private int caja = 0;
    private int inventario = 0;

    protected String tipoPago = "";

    public Ferreteria(String laminas, boolean papeleria){
        this.laminas = laminas;
        this.tipoHerramientas = "plomeria";
        this.refacciones = "tuercasRondanas";
        this.construccion = "pegaAzulejo";
        this.papeleria = papeleria;
        this.maquinaRefresco = false;
    }


    public Ferreteria(){
        this.laminas = "aceroInoxidable";
        this.tipoHerramientas = "plomeria";
        this.refacciones = "tuercasRondanas";
        this.construccion = "pegaAzulejo";
        this.papeleria = true;
        this.maquinaRefresco = false;
    }

}


