package pesquisa.binaria;

public class PesquisaBinaria {

    public static int pesquisaBinaria(int[] lista, int item){
        int baixo = 0;
        int alto = lista.length - 1;
        int operacoes = 0;
        int posicao = -1;
        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
            operacoes++;

            if (chute == item) {
                posicao = meio;
            }

            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        System.out.println("Quantidade de operações da pesquisa Binária = " + operacoes);
        return posicao;
    }

}
