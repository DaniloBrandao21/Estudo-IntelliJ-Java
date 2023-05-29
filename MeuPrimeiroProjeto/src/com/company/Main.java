package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
            String CPF;
            int [] numeroConvertido = new int[11];
            int [] cpfnum = new int[11];
            int soma = 0;
            int soma1 = 0;
            int div1;
            int div2;
            int primeiro;
            int segundo;


            Scanner ler = new Scanner(System.in);

            System.out.println("Digite o seu CPF: ");
            CPF = ler.nextLine();

            String [] separando = CPF.split("");






            for(int i = 0; i < cpfnum.length - 2; i++){
                soma = (cpfnum[i]* ((i - 10)*-1 ) )+ soma;
                System.out.println(soma);

            }

            div1 = soma%11;

            System.out.println(div1);


            if(div1 < 2 ){
                primeiro = 0;
            }else{
                primeiro = 11 - div1;
            }

            for(int i = 0; i < cpfnum.length - 1; i++){
                soma1 = (cpfnum[i]* ((i - 11)*-1 ) )+ soma1;

            }
            div2 = soma1%11;



            if(div2 < 2 ){
                segundo = 0;
            }else{
                segundo = 11 - div2;
            }

            if(primeiro == cpfnum[9] && segundo == cpfnum[10]){
                System.out.print("CPF VÁLIDO!!!");

            }else {
                System.out.print("CPF INVÁLIDO!!!");
            }
    }

}