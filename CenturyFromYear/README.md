# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) CenturyFromYear

## DESCRIPCIÓN:

El primer siglo abarca desde el año 1 hasta el año 100. e

El segundo siglo va desde el año 101 hasta el año 200, y así sucesivamente. 

Dado un año, devuelve el siglo al que pertenece.

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097)

### EJEMPLO:

#### IN ----> OUT

1705 --> 18

1900 --> 19

1601 --> 17

2000 --> 20

## EXPLICACIÓN:

### ((number - 1) / 100):

Resta 1 al número de entrada y luego lo divide por 100.

Esto se hace para ajustar el cálculo alrededor de los siglos.

Por ejemplo, para el año 1705, al restar 1 se obtiene 1704.

Al dividir 1704 por 100, se obtiene 17 (se descarta el residuo decimal).

### + 1:

Se agrega 1 al resultado obtenido en el paso anterior.

Esto se hace para ajustar el siglo al que pertenece el año.

Por ejemplo, para el año 1705, el resultado del paso anterior fue 17,

por lo que al agregar 1 se obtiene el siglo 18.

El resultado final se devuelve como el siglo al que pertenece el año.
