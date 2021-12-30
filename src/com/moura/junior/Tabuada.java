package com.moura.junior;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;


        System.out.println("Escolha um número entre 1 e 10 para que sua tabuada seja exibida: ");

        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i++){
            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }
    }
}
