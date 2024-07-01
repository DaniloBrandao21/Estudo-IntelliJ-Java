package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static ArrayList<Contato> lista = new ArrayList<Contato>();

    public static void main(String[] args) {


        adicionarContato( new Contato("Anderson",17,"22222222222","222222222"));
        adicionarContato( new Contato("Lizandra",23,"3333333333333","333333333"));
        adicionarContato( new Contato("Murilo",13,"44444444444","444444444"));
        adicionarContato( new Contato("Gustavo",15,"55555555555","555555555"));
        adicionarContato( new Contato("Danilo-teste-git-pull",21,"66666666666","6666666666"));

        System.out.println("Imprimindo lista \n");
        imprimirContato();

        System.out.println("buscando : \n");
        buscarContato("Gil");

        System.out.println("Removendo: \n");
        removerContato("Jay");

        System.out.println("Imprimindo lista \n");
        imprimirContato();

    }
    public static void adicionarContato(Contato contato){
        lista.add(contato);
    }
    public static void removerContato(String nome){
        boolean encontrado = false;
        for(int i = 0; i < lista.size(); i++)
        {
            String nomeVez = lista.get(i).nome;
            if(nomeVez.equals(nome)){
                encontrado = true;
                lista.remove(i);
                System.out.println("Nome removido: " + nomeVez);
                break;
            }
        }
        if(!encontrado){
            System.out.println("Nome não encontardo!!!");
        }
    }
    public static void buscarContato(String nome){
        boolean encontrado = false;
        for(int i = 0; i < lista.size(); i++)
        {
            String nomeVez1 = lista.get(i).nome;
            if(nomeVez1.equals(nome)){
                encontrado = true;
                System.out.println("Nome encontardo!!!");
                System.out.print("\nnome: " + lista.get(i).nome +
                                 "\nidade: " + lista.get(i).idade +
                                 "\nCPF: " + lista.get(i).CPF +
                                 "\ntelefone: " + lista.get(i).telefone +
                                 "\n----------\n");
            }
        }
        if(!encontrado){
            System.out.println("Nome não encontardo!!!");
        }

    }
    public static void imprimirContato(){
        for (Contato item : lista){
            System.out.print("\nnome: " + item.nome +
                             "\nidade: " + item.idade +
                             "\nCPF: " + item.CPF +
                             "\ntelefone: " + item.telefone + "\n----------\n");
        }
    }
}
// Criando a Classe
     class Contato{
    public String nome;
    public int idade;
    public String CPF;
    public String telefone;

    // Método construtor
    public Contato(String nome,int idade,String CPF,String telefone){

        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.telefone = telefone;

    }
}
