# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) CountSheeps

## DESCRIPCIÓN:

Si no puedes dormir, simplemente cuenta ovejas.

Dado un número entero no negativo, por ejemplo, 3, devuelve una cadena con un murmullo:

"1 sheep...2 sheep...3 sheep...".

La entrada siempre será válida, es decir, no habrá números enteros negativos.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/5b077ebdaf15be5c7f000077)

### EJEMPLO:

#### IN ----> OUT
1 --> "1 sheep..."

2 --> "1 sheep...2 sheep..."

3 --> "1 sheep...2 sheep...3 sheep..."

## EXPLICACIÓN:

#### countingSheep()

Recibe un parámetro num que indica el número de veces que se repetirá la cadena.

#### IntStream.rangeClosed(1, num) 

Crea un IntStream que genera una secuencia de números enteros desde 1 hasta num, ambos inclusivos. 
Esto genera una secuencia de números que representará cada iteración de la cadena.

#### .mapToObj(i -> i + " sheep...") 

aplica una transformación a cada número en el IntStream. 

#### lambda i -> i + " sheep..." 

Toma un número i y lo concatena con la cadena " sheep...", creando así una cadena que representa una iteración de la cadena completa.

#### .collect(Collectors.joining()) 

Recolecta todas las cadenas resultantes en una sola cadena utilizando el método joining() de la clase Collectors. 
En este caso, no se proporciona ningún delimitador en el argumento, lo que significa que no habrá ningún carácter que separe las iteraciones de la cadena en la cadena final. 
Por lo tanto, las cadenas se concatenarán directamente una tras otra.

Finalmente, la cadena resultante se devuelve como resultado de la función countingSheep().
