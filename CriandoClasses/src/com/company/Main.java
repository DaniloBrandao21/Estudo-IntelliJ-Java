package com.company;

public class Main {

    public static void main(String[] args) {

        //criando os objetos da classe Animal

       Animal animal = new Animal("Felpudo", 12, 15.0f, "Verde");
        Humano humano = new Humano("Danilo", 21, 80,"pardo");
        Animal animal2 = new Animal("xxxx", 20, 15.0f, "Verde");

        /*

        Chamando o método da classe

         Estrutura (nome da classe principal.Nome da classe da interna  nome da variavel = new nome da classe principal.Nome da classe da interna()


         */
        Animal.ClasseInterna classeint = new Animal.ClasseInterna();

        System.out.println(animal.idade);
        animal.falar();
        humano.falar();

        final int IDADE = 12 ;


    }
}
//criando a classe Animal

class Animal{

     String nome;
     static int idade;
     float peso;
     String cor;


    //criando método construtor da classe Animal

     public Animal(String nome, int idade, float peso, String cor){

         //this = em relação a está classe
         this.nome = nome;
         this.idade = idade;
         this.peso = peso;
         this.cor = cor;

     }

     //criando os métodos da classe Animal

     public void falar(){
        System.out.println("Oii, eu sou felpudo!");
     }
     //Overloading function --- > Passando um argumento para o método

    void falar(String mensagem){
        System.out.println(mensagem);
    }
    float correr(){
        return 15.0f;
    }

    //Classe interna, declarando uma classe dentro de outra classe

    public static class ClasseInterna{

         //criando um método dentro da classe interna

        public ClasseInterna(){
            System.out.println("CLASSE ESTÁTICA");
        }
    }
}
//extends extende as propriedades de outra classe, logo, a classe Humano terá as mesmas propridades da Classe Animal
class Humano extends Animal{

    //novos atributos que a classe Animal não possui
    String profissao;
    float salario;

    public Humano(String nome, int idade, float peso, String cor){

        //Super substitui as variaveis que o método construtor da Classe Animal alimenta, pelas variaveis passadas pelo parametro
        super(nome, idade, peso, cor);
        this.profissao = profissao;
        this.salario = salario;
    }
    void trabalhar(){
        System.out.println("WORK");
    }
    //@Override ---> IDENTIFICADOR ---> Mostra que esse método já existe em um classe superior, mas que nessa classe tem outra função.
    @Override public void falar(){
        System.out.println("Oii, eu sou Danilo!");
    }

}