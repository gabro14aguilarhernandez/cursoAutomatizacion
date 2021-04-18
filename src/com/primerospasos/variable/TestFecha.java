package com.primerospasos.variable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

    /*
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    public static void main (String[] args){
        Date fechaActual = new Date();
        System.out.println(sdf.format(fechaActual));
    }
    public static String DateAString(Date fecha){
        return sdf.format(fecha);
    }*/

    public static void main (String[] args){

        int arr [][] = {{2,4,6},{3,6,8},{3,6,5}};
//        System.out.println(arr[0][0]);

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }



    }



}
