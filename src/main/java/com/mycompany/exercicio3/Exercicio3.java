package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio3 {

    public static void main(String[] args) {
//        Variaveis e scanner
        double numero1, numero2, resultado;
        Scanner entrada = new Scanner(System.in);
        
//        Entrada de dados pelo usuário
        System.out.println("Digite os números que deseja somar: ");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        entrada.close();
        
//        Operação feita para a soma das entradas
        resultado = numero1 + numero2;
        
        System.out.print("O resultado da soma é: " + resultado);
        
        
    }
}
