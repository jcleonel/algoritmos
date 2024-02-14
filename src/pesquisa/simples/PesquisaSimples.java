package pesquisa.simples;

public class PesquisaSimples {

    public static int pesquisaSimples(int[] lista, int item){
        int operacoes = 0;
        int posicao = -1;
        for (int i = 0; i < lista.length; i++) {
            operacoes++;
            if (lista[i] == item) {
                posicao = i;
            }
        }
        System.out.println("Quantidade de operações da pesquisa Simples = " + operacoes);
        return posicao;
    }
}
