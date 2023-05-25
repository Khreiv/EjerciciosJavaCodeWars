# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) SumMixedArray

## DESCRIPCIÓN:

Dado un Array de Integers como strings y numeros, devuelve la suma de los valores del Array como si todos fueran numeros.
El retorno debe ser un numero.
Asume que la entrada solo seran tipos Integer o String.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/57eaeb9578748ff92a000009)

### EJEMPLO:

#### IN ----> OUT

(9, 3, "7", "3") ---> 22

("5", "0", 9, 3, 2, 1, "9", 6, 7) ---> 42

(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7) ---> 61

("3", 6, 6, 0, "5", 8, 5, "6", 2, "0") ---> 41

## EXPLICACIÓN:

La función sum toma como entrada una lista de elementos de tipo ?, es decir, una lista que puede contener elementos de cualquier tipo. 
La función devuelve la suma de los elementos de la lista tratando de convertirlos en enteros.


#### mixed.stream() 

El método stream() se utiliza para convertir la lista mixed en un flujo de elementos. 
Un flujo es una secuencia de elementos que se pueden procesar de forma secuencial o paralela.

#### .mapToInt(n -> Integer.parseInt(String.valueOf(n)))

#### mapToInt() 

Para realizar una transformación en cada elemento del flujo. 

#### (n -> Integer.parseInt(String.valueOf(n))) 

Toma cada elemento n del flujo y realiza las siguientes operaciones:

#### String.valueOf(n) 

Convertimos el elemento n en una cadena de texto. 
Esto nos permite tratar todos los elementos como cadenas de texto para poder realizar la conversión a entero posteriormente.

#### Integer.parseInt() 

Para convertir la cadena de texto en un entero. 
Aquí, estamos asegurando que todos los elementos se traten como cadenas de texto y se intenten convertir a enteros.

#### .sum() 

Para obtener la suma de los elementos en el flujo de enteros. 
Este método suma todos los elementos y devuelve el resultado como un entero.
