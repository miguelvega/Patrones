# Patrones
Implementaremos un sistema de reproducción de medios que utiliza los patrones de diseño Adapter, State y Abstract Factory.<br>
El problema que hace posible la creación de este código es la necesidad de crear un sistema de reproducción de medios que sea flexible y extensible.

## State:
El patrón State se emplea para representar objetos que tienen la capacidad de modificar su comportamiento en respuesta a cambios en su estado interno, lo que posibilita que un objeto ajuste su forma de actuar cuando su estado cambia. Su uso consiste cuando tienes un objeto que puede tener diferentes estados y deseas que responda de manera diferente según su estado actual,  lo que previene la necesidad de utilizar múltiples construcciones condicionales, como sentencias if o switch para manejar diferentes comportamientos según el estado.



## Adapter
El patrón Adapter se utiliza cuando necesitas que dos interfaces incompatibles trabajen juntas. Actúa como un puente entre dos interfaces para que puedan colaborar sin problemas. Su uso consiste cuando deseas integrar una clase o componente existente en tu sistema que tiene una interfaz incompatible con la que necesitas en tu código. También se usa para reutilizar una clase existente que no se ajusta a la interfaz requerida. Por ejemplo, imaginemos que tenemos una clase A con una interfaz específica, pero necesitas utilizarla en un contexto donde solo se acepta una interfaz diferente, como B. En este caso, puedes crear un adaptador que implemente la interfaz B y que internamente utilice instancias de la clase A, adaptando sus métodos para que sean compatibles con la interfaz B.


### Abstract Factory:
El patrón Abstract Factory ofrece una interfaz para construir conjuntos de objetos relacionados sin la necesidad de definir explícitamente las clases específicas involucradas. Esto habilita al cliente para generar objetos sin requerir un conocimiento detallado sobre la implementación concreta de cada uno. Su uso consisye cuando necesitas crear objetos que pertenecen a una familia de productos relacionados y deseas que estos objetos sean coherentes entre sí. También se usa cuando quieres aislar el código cliente de las clases concretas, lo que facilita la sustitución de una familia de objetos por otra sin modificar el código del cliente. Por ejemplo, en nuestro codigo.
