package com.company;

public class Main {

    public static void main(String[] args){
        int num=1221;

        System.out.println("¿E numero"+ num + "es capicua?: " + esCapicua(num));
    }
    public static boolean esCapicua(int num){
        String palabra = String.valueOf(num);

        for (int i=0, j = palabra.length() -1; i <= j; i++,--j){
            if(palabra.charAt(i) != palabra.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
