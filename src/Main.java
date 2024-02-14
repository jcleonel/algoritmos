import helpers.ArrayHelper;
import ordenacao.selecao.OrdenacaoSelecao;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //int[] lista = ArrayHelper.criarArrayOrdenadoComNumerosAleatorios(102400, 1024);
        //int[] lista = ArrayHelper.criarArrayOrdenadoComNumerosDefinidos(10,8,4,9,7,6,3,7,4,3,1,11);
        //System.out.println("lista = " + Arrays.toString(lista));
        //System.out.println(Arrays.binarySearch(lista, 7));
        //System.out.println(PesquisaBinaria.pesquisaBinaria(lista2, 7));
        //System.out.println(PesquisaSimples.pesquisaSimples(lista2, 7));

        int[] lista = ArrayHelper.criarArrayComNumerosDefinidos(9,8,1);
        //int[] lista = ArrayHelper.criarArrayComNumerosAleatorios(102400, 1024);
        System.out.println("lista = " + Arrays.toString(lista));
        OrdenacaoSelecao.ordenarPorSelecaoRefatorado(lista);
        System.out.println("lista = " + Arrays.toString(lista));
        //System.out.println("Lista Ordenada Por Seleção = " + Arrays.toString(OrdenacaoSelecao.ordernarPorSelecao(lista)));
    }
}