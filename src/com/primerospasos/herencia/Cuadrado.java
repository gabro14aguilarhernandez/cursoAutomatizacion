package com.primerospasos.herencia;

public class Cuadrado extends FigurasGeometricas{
    public Cuadrado(){
        setDimension(2);
    }

    public int getPerimetro(int base, int altura){
        if(base == altura){
            setBase(base);
            setAltura(altura);
            dibuja();
            cambiaColor();
            return getBase() * getAltura();
        }else {
            System.out.println("La base y la altura no son iguales");
            return 0;
        }


    }

    @Override
    public void cambiaColor() {
        System.out.println("Color Negro");
    }
}
