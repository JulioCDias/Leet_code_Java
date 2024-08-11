package Nivel_1;

import java.util.Scanner;

public class Soma_simples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calcula a soma
        int SOMA = A + B;

        // Exibe o resultado com a mensagem requerida
        System.out.println("SOMA = " + SOMA);

        // Fecha o scanner
        scanner.close();
    }
}
