# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) CountByX

## DESCRIPCIÓN:

Crea una función con dos argumentos que devuelva un array de los primeros n múltiplos de x.

Se asume que tanto el número dado como la cantidad de veces a contar serán números positivos mayores que 0.

Devuelve los resultados como un array o lista.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/5513795bd3fafb56c200049e/java)

### EJEMPLO:

#### IN----> OUT

countBy(1, 10) ---> {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

countBy(2, 5)  ---> {2, 4, 6, 8, 10}

## EXPLICACIÓN:

El propósito de este método es generar un arreglo de enteros que contiene los múltiplos de "x" hasta el número "n".

#### "IntStream" 

Proporciona operaciones de secuencias de enteros.

#### ".rangeClosed()" 

Genera una secuencia de enteros desde 1 hasta "n".

#### ".map()" 

Multiplica cada elemento de la secuencia por "x".

#### ".toArray()" 

Convierte la secuencia de enteros en un arreglo de enteros.


