import java.util.Random;
/**
 * Escreva uma descrição da classe ROLARDADOS aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ROLARDADOS
{

    public void Play() {

        for(int m = 0; m < 1; m++){
            int dadosValor = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 1");
            System.out.println(dadosValor);
            int dadosValor2 = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 2");
            System.out.println(dadosValor2);

            for(int i = 0; i < 1; i++){
                int k = dadosValor + dadosValor2;
                System.out.println("Seu resultado foi :  " + k);
                if(k==7){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=7){
                    System.out.println("\nInfelizmente Perdeu, bora pra proxima!!");

                }else if(k==11){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=11){
                    System.out.println("\nPerdeu, bora pra proxima!!");
                }

            }
        }

    }

    public void Play2() {

        for(int m = 0; m < 1; m++){
            int dadosValor = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 1");
            System.out.println(dadosValor);
            int dadosValor2 = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 2");
            System.out.println(dadosValor2);

            for(int i = 0; i < 1; i++){
                int k = dadosValor + dadosValor2;
                System.out.println("Seu resultado foi :  " + k);
                if(k==7){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=7){
                    System.out.println("\nInfelizmente Perdeu, bora pra proxima!!");

                }else if(k==11){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=11){
                    System.out.println("\nPerdeu, bora pra proxima!!");
                }else if(k==15){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=15){
                    System.out.println("\nPerdeu, bora pra proxima!!");
                }

            }
        }

    }

    public void Play3() {

        for(int m = 0; m < 1; m++){
            int dadosValor = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 1");
            System.out.println(dadosValor);
            int dadosValor2 = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 2");
            System.out.println(dadosValor2);
            int dadosValor3 = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 3");
            System.out.println(dadosValor3);
            int dadosValor4 = (int)Math.floor(Math.random()*(6-1+1)+1);
            System.out.println("Dado 4");
            System.out.println(dadosValor4);
            for(int i = 0; i < 1; i++){
                int k = dadosValor + dadosValor2 + dadosValor3 + dadosValor4;
                System.out.println("Seu resultado foi :  " + k);
                if(k==7){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=7){
                    System.out.println("\nInfelizmente Perdeu, bora pra proxima!!");

                }else if(k==11){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=11){
                    System.out.println("\nPerdeu, bora pra proxima!!");
                }else if(k==15){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=15){
                    System.out.println("\nPerdeu, bora pra proxima!!");
                }else if(k==20){
                    System.out.println("Ganhou");
                    break;
                }else if(k!=20){
                    System.out.println("\nPerdeu, bora pra proxima!!");
                }

            }
        }

    }}
