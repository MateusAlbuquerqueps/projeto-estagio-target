package br.estagio.target.questoes.p4;

public class Logica {
    public static void main(String[] args) {
        System.out.println("a -  Proximo número: " + proximoNumeroA());
        System.out.println("b - Próximo número: " + proximoNumeroB());
        System.out.println("c -  Próximo número: " + proximoNumeroC());
        System.out.println("d  -Próximo número: " + proximoNumeroD());
        System.out.println("e - Próximo número: " + proximoNumeroE());
        System.out.println("f - Proximo número: " + proximoNumeroF());
    }

    public static int proximoNumeroA() {
        int[] sequencia = {1, 3, 5, 7};
        return sequencia[sequencia.length - 1] + 2;
    }

    public static int proximoNumeroB() {
        int[] sequencia = {2, 4, 8, 16, 32, 64};
        return sequencia[sequencia.length - 1] * 2;
    }

    public static int proximoNumeroC() {
        int[] sequencia = {0, 1, 4, 9, 16, 25, 36};
        int n = sequencia.length;
        return n * n;
    }

    public static int proximoNumeroD() {
        int[] sequencia = {4, 16, 36, 64};
        int n = (sequencia.length + 1) * 2;
        return n * n;
    }

    public static int proximoNumeroE() {
        int[] sequencia = {1, 1, 2, 3, 5, 8};
        return sequencia[sequencia.length - 1] + sequencia[sequencia.length - 2];
    }

    public static int proximoNumeroF() {
        int[] sequencia = {2, 10, 12, 16, 17, 18, 19};
        return sequencia[sequencia.length - 1] + 1;
    }
}
