package com.company;
import java.util.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int [] num = new int [] {10,20,30,40,50};
        int numero;


        numero = 20;

        System.out.print(busca(num,numero));


    }

    public static boolean busca(int [] num, int numero){
        for (int i = 0; i < num.length; i++){
            if(num[i] == numero){
               return true;
            }
        }
        return false;
    }
}
