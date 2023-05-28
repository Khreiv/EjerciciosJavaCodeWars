# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) HowGoodAreYou

## DESCRIPCIÓN:

Hubo una prueba en tu clase y la pasaste. ¡Felicidades!
Pero eres una persona ambiciosa. Quieres saber si eres mejor que el estudiante promedio de tu clase.

Recibes un arreglo con las calificaciones de tus compañeros de clase. 
¡Ahora calcula el promedio y compara tu calificación!

¡Devuelve Verdadero si eres mejor, de lo contrario Falso!

Nota:
Tus puntos no están incluidos en el arreglo de puntos de tu clase. Para calcular el punto promedio, puedes agregar tu punto al arreglo dado.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/5601409514fc93442500010b)

### EJEMPLO:

#### IN ----> OUT
(int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}), (69) -> true

## EXPLICACIÓN:

#### return java.util.stream.IntStream.of(classPoints).sum() / classPoints.length < yourPoints;

Esta línea de código realiza la comparación para determinar si tu calificación es mejor que el promedio de las calificaciones de la clase.

#### java.util.stream.IntStream.of(classPoints)

Esto crea un flujo de enteros a partir del arreglo "classPoints".

#### .sum() 

Este método de flujo suma todos los elementos del flujo de enteros.

#### / classPoints.length 

Divide la suma de los puntos de la clase entre la longitud del arreglo "classPoints" para obtener el promedio de las calificaciones de la clase.

#### < yourPoints 

Compara el promedio de las calificaciones de la clase con tu calificación. 
Si tu calificación es mayor, la expresión devuelve verdadero (true); de lo contrario, devuelve falso (false).