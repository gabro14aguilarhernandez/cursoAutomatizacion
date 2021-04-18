package com.primerospasos.variable;

public class OperadoresYCiclos {
    //operadores de comparacion
    //< > == != <= >=

    // Operadores de incremento
    // ++ -- += -=
public static void main(String args []){
//    int a = 0;
//    int b = 1;

/*    if(a==b){
        System.out.println("Entro en el if");

    }else if (a != b && a == b){
        System.out.println("Entro en el if");

    }else{
        System.out.println("Entro en el if");
    }
*/
/*    String c = "a";

    switch (c){

        case "a":
            System.out.println("Caso 1");

        case "b":
            System.out.println("Caso 2");
            break;
        case "c":
            System.out.println("Caso 3");
            break;
        case "d":
            System.out.println("Caso 4");
            break;
    }
  int a = 0;
  for(a = 0; a<=1; a++){
      System.out.println(a);

  }*/

/*
// varables de tipo objeto con un Bucle for
  int [] g ={1,2,3};
  int a = 0;
  System.out.println("Bucle for");
  for (a=0; a<g.length;a++){
      System.out.println(g[a]);
      System.out.println(g.length);
  }
*/


  // Bucle foreach
  int a=0;
  int [] g ={1,2,3};
  System.out.println("Bucle foreaach");
  for (int l : g){
      System.out.println(l);
      System.out.println("Indice: " + a);
      a++;
  }

/*
// Mientras la condicion es verdadera hace lo que esta dentro del ciclo
    a=0;
    while (a<g.length){
        System.out.println("indice " + g[a]);
        a++;
    }

// hacer lo del ciclo mientras el valor de while se cumpla,

    a = 0;
    do{
        System.out.println(g[a]);
        a++;
    }while(a<g.length);*/

}


}
