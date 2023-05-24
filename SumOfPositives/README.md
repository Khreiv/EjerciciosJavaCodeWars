# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) SumOfPositives

## DESCRIPCIÓN:

Escribir una función que, obteniendo un array de números, devuelva la suma de todos los números positivos.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/5715eaedb436cf5606000381)

### EJEMPLO:

#### IN ----> OUT

[1, -4, 7, 12] --> 1 + 7 + 12 = 20

## EXPLICACIÓN:

#### Arrays.stream() 

Para convertir el arreglo arr en un flujo de elementos.

#### .filter()

Se utiliza para filtrar los elementos del flujo, manteniendo solo aquellos números que son mayores
o iguales a cero. 

La expresión lambda num -> num >= 0 se utiliza como predicado para realizar la filtración.

#### .sum() 
Se utiliza para sumar los elementos restantes en el flujo y obtener el resultado
de la suma total.