# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) TotalAmountOfPoints

## DESCRIPCIÓN:

Nuestro equipo de fútbol ha terminado el campeonato.

Los resultados de los partidos de nuestro equipo se registran en una colección de strings.

Cada partido se representa por un string en el formato " X : Y ":

Donde X es el puntaje de nuestro equipo e Y es el puntaje del equipo contrario.

Por ejemplo: ["3:1", "2:2", "0:1", ...]

Se otorgan puntos por cada partido de la siguiente manera:

si x > y: 3 puntos (victoria)

si x < y: 0 puntos (derrota)

si x = y: 1 punto (empate)

Necesitamos escribir una función que tome esta colección y devuelva el número de puntos que nuestro equipo (x) obtuvo en el campeonato según las reglas mencionadas anteriormente.

Notas:

nuestro equipo siempre juega 10 partidos en el campeonato

0 <= x <= 4

0 <= y <= 4

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/5bb904724c47249b10000131)

### EJEMPLO:

#### IN ----> OUT

{"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"} --> 15

## EXPLICACIÓN:

#### Arrays.stream() 

Convierte el array games en un stream, lo cual permite realizar operaciones en los elementos de manera más conveniente.

#### .mapToInt(score -> score.charAt(0) - score.charAt(2)) 

Para cada resultado de partido representado como un string en el stream, se aplica una función que obtiene la diferencia entre el puntaje de nuestro equipo (representado por el primer carácter del string) 

y el puntaje del equipo contrario (representado por el tercer carácter del string). 

Esta diferencia se convierte en un int utilizando el método mapToInt().

#### .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)

Para cada diferencia de puntaje obtenida en el paso anterior, se aplica una función que asigna la cantidad correspondiente de puntos según las reglas mencionadas en el enunciado. 

Si la diferencia es mayor a 0, se asignan 3 puntos (victoria), si es igual a 0 se asigna 1 punto (empate), y si es menor a 0 se asignan 0 puntos (derrota). Esto se logra utilizando una expresión condicional ternaria.

#### .sum() 

Suma todos los puntos obtenidos en los partidos utilizando el método sum().