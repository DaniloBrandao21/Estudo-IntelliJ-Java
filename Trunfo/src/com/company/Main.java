package com.company;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<Carta> cartasJodador1 = new ArrayList<Carta>();
    public static ArrayList<Carta> cartasJodador2 = new ArrayList<Carta>();
    public static   ArrayList<Carta> cartas = new ArrayList<Carta>();
    public static   ArrayList<Carta> jogadaJogador1 = new ArrayList<Carta>();
    public static   ArrayList<Carta> jogadaJogador2 = new ArrayList<Carta>();



    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Danilo", 0, 0);
        Jogador jogador2 = new Jogador("Liz", 0, 0);


        if(jogador1.vitorias <= 3 || jogador2.vitorias <= 3 ){
            for(int i = 0;i < 3; i++) {
            System.out.println("Cartas do Jogador 1: ");
            imprimirCartas(cartasJodador1);
            System.out.println("Cartas do Jogador 2: ");
            imprimirCartas(cartasJodador2);


            //Jogador 1 escolhendo a carta para jogar

                sortearCartas();
            escolhendoCartas();


            if (jogadaJogador1.size() > 3) {

            }

            System.out.println("Jogador 1 escolheu: ");
            imprimirCartas(jogadaJogador1);

            System.out.println("Jogador 2 escolheu: ");
            imprimirCartas(jogadaJogador2);
            System.out.println("-----------------------------");

            int escolha;
            escolha = jogador1.escolherAtributo();

            switch (escolha) {
                case 1:
                    System.out.println("Tamanho do jogador 1: " + jogadaJogador1.get(0).tamanho);
                    System.out.println("Tamanho do jogador 2: " + jogadaJogador2.get(0).tamanho);
                    if (jogadaJogador1.get(0).tamanho > jogadaJogador2.get(0).tamanho) {
                        System.out.println("Jogador 1 venceu a rodada!!!");
                        jogador1.vitorias++;
                        break;
                    }
                    if (jogadaJogador1.get(0).tamanho < jogadaJogador2.get(0).tamanho) {
                        System.out.println("Jogador 2 venceu a rodada!!!");
                        jogador2.vitorias++;
                        break;
                    } else {
                        System.out.println("Empate!!!");
                        jogador1.vitorias++;
                        jogador2.vitorias++;
                    }
                    break;

                case 2:
                    System.out.println("Velocidade do jogador 1 : " + jogadaJogador1.get(0).velocidade);
                    System.out.println("Velocidade do jogador 2: " + jogadaJogador2.get(0).velocidade);
                    if (jogadaJogador1.get(0).velocidade > jogadaJogador2.get(0).velocidade) {
                        System.out.println("Jogador 1 venceu a rodada!!!");
                        jogador1.vitorias++;
                        break;
                    }
                    if (jogadaJogador1.get(0).velocidade < jogadaJogador2.get(0).velocidade) {
                        System.out.println("Jogador 2 venceu a rodada!!!");
                        jogador2.vitorias++;
                        break;
                    } else {
                        System.out.println("Empate!!!");
                        jogador1.vitorias++;
                        jogador2.vitorias++;
                    }
                    break;

                case 3:
                    System.out.println("força do jogador 1: " + jogadaJogador1.get(0).forca);
                    System.out.println("força do jogador 2: " + jogadaJogador2.get(0).forca);
                    if (jogadaJogador1.get(0).forca > jogadaJogador2.get(0).forca) {
                        System.out.println("Jogador 1 venceu a rodada!!!");
                        jogador1.vitorias++;
                        break;
                    }
                    if (jogadaJogador1.get(0).forca < jogadaJogador2.get(0).forca) {
                        System.out.println("Jogador 2 venceu a rodada!!!");
                        jogador2.vitorias++;
                        break;
                    } else {
                        System.out.println("Empate!!!");
                        jogador1.vitorias++;
                        jogador2.vitorias++;
                    }
                    break;

                case 4:
                    System.out.println("Ferocidade do jogador 1 : " + jogadaJogador1.get(0).ferocidade);
                    System.out.println("Ferocidade do jogador 2: " + jogadaJogador2.get(0).ferocidade);
                    if (jogadaJogador1.get(0).ferocidade > jogadaJogador2.get(0).ferocidade) {
                        System.out.println("Jogador 1 venceu a rodada!!!");
                        jogador1.vitorias++;
                        break;
                    }
                    if (jogadaJogador1.get(0).ferocidade < jogadaJogador2.get(0).ferocidade) {
                        System.out.println("Jogador 2 venceu a rodada!!!");
                        jogador2.vitorias++;
                        break;
                    } else {
                        System.out.println("Empate!!!");
                        jogador1.vitorias++;
                        jogador2.vitorias++;
                    }
                    break;
            }
            System.out.println("\n ----------------------");
            System.out.println("Placar: \n ----------------------");
            System.out.println("Jogador 1 --->" + jogador1.vitorias);
            System.out.println("Jogador 2 --->" + jogador2.vitorias);

            //Zerando o valor da lista para não ficar lixo na memória
            jogadaJogador1.remove(0);
            jogadaJogador2.remove(0);
        }

        }

        if(jogador1.vitorias > jogador2.vitorias){
            System.out.println("Jogador 1 venceu !!!");
        }else{
            System.out.println("Jogador 2 venceu !!!");
        }
    }
//Sorteando as cartas
    static void sortearCartas() {


        cartas.add(new Carta("Aguia", 1.0f, 100, 6, 5));
        cartas.add(new Carta("Urso", 4.5f, 20, 18, 8));
        cartas.add(new Carta("Leão", 2.0f, 45, 12, 6));
        cartas.add(new Carta("Gorila", 3.4f, 20, 10, 4));
        cartas.add(new Carta("Jacaré", 2.8f, 5, 20, 8));
        cartas.add(new Carta("Cobra", 9.0f, 8, 8, 7));
        cartas.add(new Carta("Leopardo", 2.0f, 80, 11, 7));
        cartas.add(new Carta("Crocodilo", 7.0f, 7, 25, 10));
        cartas.add(new Carta("Onça", 2.0f, 70, 12, 8));
        cartas.add(new Carta("Hipopotamo", 3.0f, 30, 25, 9));
        cartas.add(new Carta("Elefante", 4.0f, 20, 30, 5));
        cartas.add(new Carta("Girrafa", 14.0f, 20, 20, 3));


        Random sortear = new Random();

        //faz o sorteio do numero

        //vetor para guardar os numeros sorteados
       boolean val2 = true;
       int confimacaoJ = 0;
        int confimacaoI = 0;

        do {

            System.out.println("Numeros do primeiro sorteio ");
            int guarda_numero[] = semRepeticao();

            System.out.println("Numeros do segundo sorteio ");
            int guarda_numero2[] = semRepeticao();

            for(int i = 0; i < guarda_numero.length; i++) {

                for (int j = 0; j < guarda_numero2.length; j++) {

                    if (guarda_numero[i] == guarda_numero2[j]) {
                        val2 = true;
                    } else {
                        j++;
                    }

                }
                i++;

                }

        }while ( val2 );


        for (int i = 0; i < 3; i++) {

                switch (i) {
                    case 0:
                        cartasJodador1.add(cartas.get(0));
                        break;
                    case 1:
                        cartasJodador1.add(cartas.get(1));
                        break;
                    case 2:
                        cartasJodador1.add(cartas.get(2));
                        break;
                    case 3:
                        cartasJodador1.add(cartas.get(3));
                        break;
                    case 4:
                        cartasJodador1.add(cartas.get(4));
                        break;
                    case 5:
                        cartasJodador1.add(cartas.get(5));
                        break;
                    case 6:
                        cartasJodador1.add(cartas.get(6));
                        break;
                    case 7:
                        cartasJodador1.add(cartas.get(7));
                        break;
                    case 8:
                        cartasJodador1.add(cartas.get(8));
                        break;
                    case 9:
                        cartasJodador1.add(cartas.get(9));
                        break;
                    case 10:
                        cartasJodador1.add(cartas.get(10));
                        break;
                    case 11:
                        cartasJodador1.add(cartas.get(11));
                        break;

                }
            }

        //sorteio para as cartas do jogador 2

               for (int i = 0; i < 3; i++) {

                   switch (i) {
                       case 0:
                           cartasJodador2.add(cartas.get(0));
                           break;
                       case 1:
                           cartasJodador2.add(cartas.get(1));
                           break;
                       case 2:
                           cartasJodador2.add(cartas.get(2));
                           break;
                       case 3:
                           cartasJodador2.add(cartas.get(3));
                           break;
                       case 4:
                           cartasJodador2.add(cartas.get(4));
                           break;
                       case 5:
                           cartasJodador2.add(cartas.get(5));
                           break;
                       case 6:
                           cartasJodador2.add(cartas.get(6));
                           break;
                       case 7:
                           cartasJodador2.add(cartas.get(7));
                           break;
                       case 8:
                           cartasJodador2.add(cartas.get(8));
                           break;
                       case 9:
                           cartasJodador2.add(cartas.get(9));
                           break;
                       case 10:
                           cartasJodador2.add(cartas.get(10));
                           break;
                       case 11:
                           cartasJodador2.add(cartas.get(11));
                           break;
                   }
               }
    }

//Escolher carta
    static void escolhendoCartas(){

        //Jogador 1 escolhendo a carta para jogar

        Scanner escolhendo = new Scanner(System.in);

        System.out.println("Escolha seguindo a ordem cardinal, começando por 1 ");

        for (Carta item : cartasJodador1){
            System.out.println("\n" + " -----> Nome: " + item.nome );
            }
        int escolha = escolhendo.nextInt();

        switch (escolha){

            case 1: jogadaJogador1.add(cartasJodador1.get(0));
                cartasJodador1.remove(0);
                break;
            case 2: jogadaJogador1.add(cartasJodador1.get(1));
                cartasJodador1.remove(1);
                break;
            case 3: jogadaJogador1.add(cartasJodador1.get(2));
                cartasJodador1.remove(2);
                break;

        }

        Random ram = new Random();

        escolha = ram.nextInt(cartasJodador2.size());
        switch (escolha){

            case 0: jogadaJogador2.add(cartasJodador2.get(0));
                cartasJodador2.remove(0);
                break;
            case 1: jogadaJogador2.add(cartasJodador2.get(1));
                cartasJodador2.remove(1);
                break;
            case 2: jogadaJogador2.add(cartasJodador2.get(2));
                cartasJodador2.remove(2);
                break;
        }
    }

//Imprimir cartas
    static void imprimirCartas(ArrayList<Carta> lista){
        for (Carta item : lista){
            System.out.print("\n Nome: " + item.nome +
                    "\n Tamanho: " + item.tamanho +
                    "\n Velocidade: " + item.velocidade +
                    "\n Força: " + item.forca +
                    "\n Ferocidade: " + item.ferocidade +
                    "\n -----------------------");
        }
    }

    static int [] semRepeticao(){

        int [] guardar_numero = new int [3];
        int val = 2;
        Random sortear = new Random();
    //Sistema para nao haver repetições no sorteio 2
            do {

        for (int ii = 0; ii < 3; ii++) {
            int numeros = sortear.nextInt(cartas.size());
            guardar_numero[ii] = numeros;
        }

        if (guardar_numero[0] == guardar_numero[1] || guardar_numero[1] == guardar_numero[2] ||
                guardar_numero[0] == guardar_numero[2]) {
            val = 2;

        } else {
            val = 1;
        }

        System.out.println("posição do vetor guardar numero 2 \n " + guardar_numero[0]);
        System.out.println(guardar_numero[1]);
        System.out.println(guardar_numero[2]);

    } while (val == 2);

            return guardar_numero;
    }
}

//Declarando a Classe Carta
    class Carta{

    String nome;
    float tamanho;
    int velocidade;
    int forca;
    int ferocidade;

    //método counstrutor de cartas

    public Carta(String nome, float tamanho, int velocidade, int forca, int ferocidade){

        this.nome = nome;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.forca = forca;
        this.ferocidade = ferocidade;

    }

}
class Jogador{

    String nome;
    int cartas;
    int vitorias;

    public Jogador(String nome, int cartas, int vitorias){

        this.nome = nome;
        this.cartas = cartas;
        this.vitorias = vitorias;

    }

    public int escolherAtributo(){

        //ler a jogada do jogador
        int atributo;
        Scanner escolha = new Scanner(System.in);

        System.out.println("Escolha um atributo: ");
        System.out.println("1 --------> tamanho");
        System.out.println("2 --------> velocidade");
        System.out.println("3 --------> força");
        System.out.println("4 --------> ferocidade");

        //Ler a entradade de dados c/ a variavel do tipo Scanner (entrada) e jogar para variavel do tipo inteiro (atributo)
        atributo = escolha.nextInt();

        return atributo;
    }
}