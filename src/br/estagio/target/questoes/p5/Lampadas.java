package br.estagio.target.questoes.p5;

public class Lampadas {
    public static void main(String[] args) {
        int[] lampadas = {0, 0, 0};
        int[] interruptores = {0, 0, 0};

        ligarInterruptor(interruptores, 0);
        desligarInterruptor(interruptores, 0);
        ligarInterruptor(interruptores, 1);
        atualizarLampadas(interruptores, lampadas);
        mostrarResultados(lampadas);
    }

    public static void ligarInterruptor(int[] interruptores, int index) {
        interruptores[index] = 1;
    }
    public static void desligarInterruptor(int[] interruptores, int index) {
        interruptores[index] = 0;
    }
    public static void atualizarLampadas(int[] interruptores, int[] lampadas) {
        if (interruptores[0] == 0) {
            lampadas[0] = 2;
        }
        if (interruptores[1] == 1) {
            lampadas[1] = 1;
        }
        if (interruptores[2] == 0) {
            lampadas[2] = 0;
        }
    }
    public static void mostrarResultados(int[] lampadas) {
        String[] estados = {"apagada ", "acesa", "apagada"};

        for (int i = 0; i < lampadas.length; i++) {
            System.out.println("Lâmpada " + (i + 1) + " está " + estados[lampadas[i]]);
        }
    }
}
