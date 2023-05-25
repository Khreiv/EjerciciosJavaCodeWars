package com.khreiv.SumMixedArray;
/*
DESCRIPCIÓN:
Dado un Array de Integers como strings y numeros, devuelve la suma de los valores del Array como si todos fueran numeros.
El retorno debe ser un numero.
Asume que la entrada solo seran tipos Integer o String.

EJEMPLO:
("5", "0", 9, 3, 2, 1, "9", 6, 7) ---> 42
(9, 3, "7", "3") ---> 22
("3", 6, 6, 0, "5", 8, 5, "6", 2, "0") ---> 41
(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7) ---> 61
*/
import java.util.List;

public class SumMixedArray {

    public static void main(String[] args) {
        System.out.println(sum(java.util.Arrays.asList(5,"5")));
    }
    public static int sum(List<?> mixed){
        return mixed.stream()
                .mapToInt(n -> Integer.parseInt(String.valueOf(n)))
                .sum();
    }
}
