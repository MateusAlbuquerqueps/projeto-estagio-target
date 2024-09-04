package br.estagio.target.questoes.p2;

import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String input = scanner.nextLine();

        int count = verificaLetra(input);
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
        scanner.close();
    }

    public static int verificaLetra(String letra) {
        int contador = 0;
        for (int i = 0; i < letra.length(); i++) {
            char c = letra.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
