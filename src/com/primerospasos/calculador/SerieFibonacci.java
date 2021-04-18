package com.primerospasos.calculador;

public class SerieFibonacci {

    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        int c= 0;
 //       System.out.print(a + ", " + b + ", ");
        for (int i=1; i<=15; i++){
            System.out.print(c + ", ");
            if (c<=100) {
                c = a + b;

                a = b;
                b = c;
            }
        }
    }
}
