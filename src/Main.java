import helpers.ArrayHelper;
import ordenacao.selecao.OrdenacaoSelecao;
import recursao.Recursao;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Recursao.contagemRegressiva(10);
//        Recursao.contagemRegressivaRecursivo(10);
      //  System.out.println("Fatorial = " + Recursao.calculaFatorial(5));
       // System.out.println("Fatorial recursivo = " + Recursao.calculaFatorialRecursivo(5));

        //int[] lista = ArrayHelper.criarArrayOrdenadoComNumerosAleatorios(102400, 1024);
        //int[] lista = ArrayHelper.criarArrayOrdenadoComNumerosDefinidos(10,8,4,9,7,6,3,7,4,3,1,11);
        //System.out.println("lista = " + Arrays.toString(lista));
        //System.out.println(Arrays.binarySearch(lista, 7));
        //System.out.println(PesquisaBinaria.pesquisaBinaria(lista2, 7));
        //System.out.println(PesquisaSimples.pesquisaSimples(lista2, 7));

        //int[] lista = ArrayHelper.criarArrayComNumerosDefinidos(9,8,1);
        //int[] lista = ArrayHelper.criarArrayComNumerosAleatorios(102400, 1024);
        //System.out.println("lista = " + Arrays.toString(lista));
       // OrdenacaoSelecao.ordenarPorSelecaoRefatorado(lista);
        //System.out.println("lista = " + Arrays.toString(lista));
        //System.out.println("Lista Ordenada Por Seleção = " + Arrays.toString(OrdenacaoSelecao.ordernarPorSelecao(lista)));

        Runnable task = () -> {
            System.out.print(Thread.currentThread().getName() + "#A ");
            System.out.print(Thread.currentThread().getName() + "#B ");
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.setName("t1");
        thread2.setName("t2");

        thread1.start();
        thread2.start();

        System.out.print(Thread.currentThread().getName() + "#A ");
    }
}