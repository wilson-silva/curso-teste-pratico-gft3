package br.com.gft.exercicio4;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String palavra = scan.nextLine();
        String palavraSemEspaco = palavra.replace(" ", "");

        String palavraInvertida = new StringBuilder(palavra).reverse().toString().replace(" ", "");

        if(palavraSemEspaco.equals(palavraInvertida)){
            System.out.println(palavra + " - > true");
        }else{
            System.out.println(palavra + " -> false");
        }



    }
}
