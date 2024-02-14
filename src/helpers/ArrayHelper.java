package helpers;

import java.util.Arrays;

public class ArrayHelper {

    public static int[] criarArrayOrdenadoComNumerosAleatorios(int tamanho, int faixaDeNumeros){
        int[] array = criarArrayComNumerosAleatorios(tamanho, faixaDeNumeros);
        Arrays.sort(array);
        return array;
    }

    public static int[] criarArrayComNumerosAleatorios(int tamanho, int faixaDeNumeros){
        int[] array = new int[tamanho];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * faixaDeNumeros);
        }
        return array;
    }

    public static int[] criarArrayOrdenadoComNumerosDefinidos(int ...elementos){
        int[] array = criarArrayComNumerosDefinidos(elementos);
        Arrays.sort(array);
        return array;
    }

    public static int[] criarArrayComNumerosDefinidos(int ...elementos){
        int[] array = new int[elementos.length];
        System.arraycopy(elementos, 0, array, 0, array.length);
        return array;
    }
}
