# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) NeedleInTheHaystack

## DESCRIPCIÓN:

¿Puedes encontrar la aguja en el pajar?

Escribe una función findNeedle() que tome un array lleno de basura pero que contenga una "aguja".

Después de que tu función encuentre la aguja, debería devolver un mensaje (como un string) que diga:

"encontré la aguja en la posición " más el índice donde encontró la aguja.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/56676e8fabd2d1ff3000000c)

### EJEMPLO:

#### IN ----> OUT

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"

## EXPLICACIÓN:

#### Arrays.asList(haystack) 
Se utiliza para convertir el arreglo en una lista.

#### indexOf() 

Para encontrar la posición del elemento "needle" en la lista.

#### String.format() 

Se utiliza para formatear el mensaje de salida, que indicará la posición encontrada.
