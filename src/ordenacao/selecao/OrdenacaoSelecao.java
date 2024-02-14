package ordenacao.selecao;

public class OrdenacaoSelecao {

    /*Refatorado usando o exemplo do livro*/
    public static void ordenarPorSelecaoRefatorado(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int[] ordernarPorSelecao(int[] array) {
        int tamanhoInicialDoArray = array.length;
        int[] novoArray = new int[array.length];
        for (int i = 0; i < tamanhoInicialDoArray; i++) {
            int menorIndice = buscaMenor(array);
            novoArray[i] = array[menorIndice];
            array = eliminaElementoDoArray(array, menorIndice);
        }
        return novoArray;
    }

    public static int[] eliminaElementoDoArray(int[] array, int posicaoParaEliminar){
        int[] novoArray = new int[array.length - 1];
        int posicaoAtualDoNovoArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == posicaoParaEliminar) {
                continue;
            }
            novoArray[posicaoAtualDoNovoArray] = array[i];
            posicaoAtualDoNovoArray++;
        }
        return novoArray;
    }

    private static int buscaMenor(int[] array) {
        int menor = array[0];
        int menorIndice = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
                menorIndice = i;
            }
        }
        return menorIndice;
    }
}
