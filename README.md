# SpaceshipSimulator

## Objetivos

1.- Implementar una clase de tipo SpaceShip. Incluir en ella:

    Matrícula galáctica.
    Aceleración.
    Velocidad X.
    Velocidad Y.
    Coordenada X.
    Coordenada Y.
    Dirección X 
    Dirección Y

   - Deberá haber un constructor que reciba los parámetros velocidad X, velocidad Y, coordenada X y coordenada Y, dirección X y Dirección Y,
reciban un valor inicial lógico para la clase que representan.

2.- La clase SpaceShip debe incluir un método denominado speedUp que calcule la nueva velocidad y posición de la nave espacial después de haber aplicado a la velocidad actual la aceleración correspondiente.

3.- Sobrecarga el método toString de la clase SpaceShip para que muestre una representación AsciiArt de la misma. Como ejemplos inspiradores les dejo los siguientes enlaces: ​​
    https://www.asciiart.eu/space/spaceships
    https://ascii.co.uk/art/spaceships

4.- Crea un directorio docs que cuelgue de la raíz del proyecto y dentro de él, crea un nuevo documento MarkDown denominado SpaceShip.md donde tendrás que explicar el funcionamiento de tu clase SpaceShip, incluyendo las referencias de las páginas webs que hayas utilizado para obtener información sobre el cálculo de la velocidad y posición. Enlaza este documento desde el Readme.md

5.- Crea un nuevo método que se denomine brake y que lo que haga sea hacer que la nave frene aplicando la misma aceleración pero en sentido contrario.

6.- Crea un nuevo método que se denomine emergencyStop, que lo que haga es que la velocidad de la nave pase a ser cero inmediatamente.

7.- Crea una nueva clase denominada Cargo que extienda a la anterior. Esta clase debe incluir un nuevo atributo que represente la capacidad de carga máxima. Entendemos la capacidad de carga de una nave de tipo Cargo como el número de containers máximos que puede transportar.

8.- Crea un método denominado load() que añada un container a la bodega de una nave de tipo Cargo si aún hay espacio y que muestre un mensaje de error en el caso de que ya no quepa un nuevo container en la misma.

9.- Crea un método denominado unload() que elimine un container de la bodega de carga de una nave de tipo Cargo si hay alguno almacenado allí. En caso contrario debe mostrar un mensaje de aviso indicando que no puede descargarse porque no hay containers almacenados allí.

10.- Crea un nuevo documento en la carpeta docs de tu proyecto y denomínalo Cargo.md, procede como en el caso anterior explica el funcionamiento de tu clase Cargo así como cualquier referencia que hayas utilizado en este caso. Enlaza este nuevo documento desde el archivo Readme.md.
 
11.- Por último, diseña una interfaz que permita al usuario crear una nueva nave, muestre su asciiArt correspondiente y permita que el usuario acelere, frene o pare. El usuario debe poder salir en cualquier momento de la aplicación.

#### Enlace para acceder a la explicación de la clase:

> [Funcionamiento de la clase SpaceShip.java](./docs/SpaceShip.md)