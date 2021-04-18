package com.primerospasos.calculador;

public class OperacionesAritmeticas {
    public double suma (double a, double b){

        return a + b;
    }

    public double resta (double a, double b){

        return  a - b;
    }

    public double multiplicacion (double a, double b){

        return a * b;
    }

    public double division (double a, double b){

        return a / b;
    }

    public void impresionUnoCincuenta (int tot, String f){
       int i = 0;
       if (f.equals("ascendente")) {
           for (i = 1; i < tot; i++) {
               System.out.print(i + ", ");
           }
           System.out.print(tot + ".");
       } else if (f.equals("descendente")){
           for (i = tot ; i >=2; i--) {
                System.out.print(i + ", ");
            }
            System.out.print("1.");
       }
    }
}

