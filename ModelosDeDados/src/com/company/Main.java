package com.company;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //criando variavel arraylist do tipo contato
        ArrayList<Contato> lista = new ArrayList<Contato>();

    //criando objetos

        Contato contato = new Contato("Danilo", "555", "dasdnakdas", "dasfaf");

    //Adicionando contato a lista contato
    lista.add(contato);

    //criando objetos e Adicionando contato a lista contato

        lista.add (new Contato("Anderson", "444", "asdadad", "dasfadasdaf"));
        lista.add (new Contato("Murilo", "333", "dasdnakdas", "dasfaf"));
        lista.add (new Contato("Gustavo", "222", "dasdnakdas", "dasfaf"));
        lista.add (new Contato("Ademilson", "111", "dasdnakdas", "dasfaf"));
        lista.add (new Contato("Débora", "000", "dasdnakdas", "dasfaf"));

    System.out.println(lista.get(0).nome);
        System.out.println(lista.get(1).nome);
        System.out.println(lista.get(2).nome);
        System.out.println(lista.get(3).nome);


    // System.out.println(contato.nome);
    }
}

class Contato{

    String nome;
    String telefone;
    String email;
    String empresa;

    public Contato(String nome, String telefone, String email, String empresa){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.empresa = empresa;

    }

}

