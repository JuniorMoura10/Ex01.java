package com.moura.junior;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numeros;
        int quantPares = 0, quantImpares = 0;

        int count = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Numero: ");
            numeros = scan.nextInt();
            if(numeros % 2 == 0) quantPares++;
            else quantImpares++;
            count++;

        }while(count < quantNumeros);

        System.out.println("A quantidade de números pares digitados é: " + quantPares);
        System.out.println("A quantidade de números impares digitados é: " + quantImpares);
    }
}
