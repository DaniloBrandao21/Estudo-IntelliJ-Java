package com.company;
import java.util.*;
public class Main
    {
        // tip: arguments are passed via the field below this editor
        public static void main(String[] args)
        {
            ArrayList<Integer> lista = new ArrayList <Integer>();
            int meuNum = Integer.parseInt(args[0]);


            for(int i = 0; i <= meuNum;i++){
                lista.add(i);

            }


            for(int i = 0; i < lista.size();i++)
            {

                boolean primo = true;
                for(int j = 2; j < lista.get(i);j++)
                {
                    if(lista.get(i) % j == 0)
                    {
                        primo = false;
                        break;
                    }

                }
                if(primo)
                {
                    System.out.print(lista.get(i)+ ", ");
                }
            }
        }
    }