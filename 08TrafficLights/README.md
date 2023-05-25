# ![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) SumMixedArray

## DESCRIPCIÓN:

Estás escribiendo código para controlar los semáforos de tu ciudad. 

Necesitas una función que maneje cada cambio de verde a amarillo, luego a rojo, y luego nuevamente a verde.

Completa la función que recibe una cadena de texto como argumento que representa el estado actual del semáforo, y devuelve una cadena de texto que representa el estado al que el semáforo debe cambiar.

Por ejemplo, cuando la entrada es "verde", la salida debería ser "amarillo".

[![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)](https://www.codewars.com/kata/58649884a1659ed6cb000072)

### EJEMPLO:

#### IN ----> OUT

"green" ---> "yellow"

"yellow" ---> "red"

"red" ---> "green"

## EXPLICACIÓN:

La función updateLight recibe como parámetro una cadena de texto current, que representa el estado actual del semáforo. 
El objetivo de la función es determinar el estado siguiente del semáforo y devolverlo como una cadena de texto.

### .equals()

Se compara el valor de current con la cadena de texto "red". 
Si current es igual a "red" la condición current.equals("red") se evalúa como true.
El resultado de la expresión ternaria es "green", que es el estado siguiente después del rojo.
Por lo tanto, se devuelve "green" como el siguiente estado del semáforo.

Si current no es igual a "red", se pasa a la siguiente parte de la expresión ternaria. 
Aquí se compara current con la cadena de texto "green". 
Si current es igual a "green" la condición current.equals("green") se evalúa como true.
El resultado de la expresión ternaria es "yellow", que es el estado siguiente después del verde.

Si current no es ni "red" ni "green"), se pasa a la parte final de la expresión ternaria. 
En este caso, no es necesario realizar una comparación adicional, ya que cualquier otro estado diferente a rojo o verde será tratado como el estado siguiente después del amarillo. 
Por lo tanto, la expresión ternaria simplemente devuelve "red" como el siguiente estado del semáforo.