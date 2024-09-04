package br.estagio.target.questoes.p1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero para verificar se pertence a sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        if (verificaFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }

        scanner.close();

    }

    public static boolean verificaFibonacci(int n) {
        // validação
        if (n < 0) {
            return false;
        }
        int a = 0, b = 1;
        while (a < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a == n;
    }
}
