# Patrones
Simularemos un sistema de almacenamiento que incluye dispositivos de almacenamiento USB y discos duros, así como archivos y estados de almacenamiento, para ello utilizaremos los patrones de diseño Adapter, State y Abstract Factory. <br>

## State:
El patrón State se emplea para representar objetos que tienen la capacidad de modificar su comportamiento en respuesta a cambios en su estado interno, lo que posibilita que un objeto ajuste su forma de actuar cuando su estado cambia. Su uso consiste cuando tienes un objeto que puede tener diferentes estados y deseas que responda de manera diferente según su estado actual,  lo que previene la necesidad de utilizar múltiples construcciones condicionales, como sentencias if o switch para manejar diferentes comportamientos según el estado.

### En el codigo
- CakeOrderState es la interfaz que declara un método process_order.
- PendingState, InProcessState y DeliveredState son estados concretos que implementan process_order para cambiar el estado del pedido.
- CakeOrder es la clase que utiliza el patrón State, inicializa su estado como PendingState y tiene un método process_order que delega al estado actual.



## Adapter
El patrón Adapter se utiliza cuando necesitas que dos interfaces incompatibles trabajen juntas. Actúa como un puente entre dos interfaces para que puedan colaborar sin problemas. Su uso consiste cuando deseas integrar una clase o componente existente en tu sistema que tiene una interfaz incompatible con la que necesitas en tu código. También se usa para reutilizar una clase existente que no se ajusta a la interfaz requerida. Por ejemplo, imaginemos que tenemos una clase A con una interfaz específica, pero necesitas utilizarla en un contexto donde solo se acepta una interfaz diferente, como B. En este caso, puedes crear un adaptador que implemente la interfaz B y que internamente utilice instancias de la clase A, adaptando sus métodos para que sean compatibles con la interfaz B.

### En el codigo

- OldCashRegister representa la máquina antigua de registro de ventas con su propia interfaz.
- AccountingSystem es la interfaz que se espera en el nuevo sistema de contabilidad.
- CashRegisterAdapter es el adaptador que toma la máquina antigua y la adapta para que funcione con la interfaz del sistema de contabilidad.
- Transaction es una clase que se utiliza para registrar transacciones.
- Se crea una instancia de CashRegisterAdapter para conectar la máquina antigua con el nuevo sistema de contabilidad y registrar transacciones.


### Abstract Factory:
El patrón Abstract Factory ofrece una interfaz para construir conjuntos de objetos relacionados sin la necesidad de definir explícitamente las clases específicas involucradas. Esto habilita al cliente para generar objetos sin requerir un conocimiento detallado sobre la implementación concreta de cada uno. Su uso consiste cuando necesitas crear objetos que pertenecen a una familia de productos relacionados y deseas que estos objetos sean coherentes entre sí. También se usa cuando quieres aislar el código cliente de las clases concretas, lo que facilita la sustitución de una familia de objetos por otra sin modificar el código del cliente. Por ejemplo, en nuestro codigo.

### En el codigo

- CakeFactory es la interfaz abstracta para la fábrica de pasteles, que declara un método create_cake.
- ChocolateCakeFactory y StrawberryCakeFactory son las fábricas concretas que implementan create_cake para crear pasteles de chocolate y fresa, respectivamente.
- Cake, ChocolateCake, y StrawberryCake son las clases relacionadas que representan los objetos que se crearán mediante la fábrica.
