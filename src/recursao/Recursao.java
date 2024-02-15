package recursao;

public class Recursao {

    public static int calculaFatorial(int numero) {
        if (numero == 1 || numero == 0) {
            return 1;
        }

        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            fatorial *= numero;
            numero--;
        }
        return fatorial;
    }

    public static int calculaFatorialRecursivo(int numero) {
        if (numero == 1 || numero == 0) {
            return 1;
        }

        return numero * calculaFatorialRecursivo(numero - 1);
    }

    public static void contagemRegressiva(int contador) {
        while (contador >= 0) {
            System.out.print(contador + " ");
            contador--;
        }
        System.out.println();
    }

    public static void contagemRegressivaRecursivo(int contador) {
        System.out.print(contador + " ");
        if (contador > 0) {
            contagemRegressivaRecursivo(contador - 1);
        }
    }

}
