# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) SumWithoutHighestAndLowest

## DESCRIPCIÓN:

Suma todos los números de un array dado (o lista), excepto el número más alto y el número más bajo (por valor, no por índice).

El número más alto o más bajo respectivamente es un único elemento en cada extremo, incluso si hay más de uno con el mismo valor.

Ten en cuenta la validación de entrada:

Si se proporciona un valor vacío (null, None, Nothing, etc.) en lugar de un array, o el array dado es una lista vacía o una lista con solo 1 elemento, devuelve 0.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/576b93db1129fcf2200001e6)

### EJEMPLO:

#### IN ----> OUT

{ 6, 2, 1, 8, 10 } --> 16

{ 1, 1, 11, 2, 3 } --> 6

## EXPLICACIÓN:

#### numbers != null

Verifica si el array numbers no es nulo. Si el array es nulo, se retorna 0.

#### numbers.length > 1 

Verifica si la longitud del array numbers es mayor que 1. Si la longitud es 1 o menor, se retorna 0.

#### Arrays.stream(numbers): 

Crea un flujo (stream) a partir del array numbers utilizando la clase java.util.Arrays.

Esto nos permite realizar operaciones en los elementos del array utilizando métodos de stream.

#### .anyMatch(n -> n != 0) 

Utilizando el método anyMatch, se verifica si algún elemento del array es diferente de cero.

Si se encuentra al menos un elemento no nulo, se continúa con la siguiente etapa.

Si no se cumple esta condición, se retorna 0.

#### .sorted() 

Ordena los elementos del stream en orden ascendente.

Esto nos permitirá omitir el menor y el mayor posteriormente.

#### .skip(1) 

Omite el primer elemento del stream, que será el menor valor después de ordenar los elementos.

#### .limit(numbers.length - 2) 

Limita el stream al tamaño de numbers.length - 2,

lo que significa que se omitirán el menor y el mayor valor en la suma.

#### .sum() 

Realiza la suma de todos los elementos restantes en el stream después de aplicar las operaciones anteriores.

Si se cumple todas las condiciones anteriores y se realiza la suma correctamente, se devuelve el resultado.

Si no se cumplen las condiciones, se retorna 0.
