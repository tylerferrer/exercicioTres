package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio3 {

    public static void main(String[] args) {
        double numero1, numero2, resultado;
//        double numero2;
//        double resultado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite os números que deseja somar: ");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        entrada.close();
        
        resultado = numero1 + numero2;
        
        System.out.print("O resultado da soma é: ");
        System.out.print(resultado);
        
        
    }
}
