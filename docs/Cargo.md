## Cargo

####- La clase tiene como atributos:

> private static final int CARGA_MAXIMA = 300;
> 
> Esta variable define la cantidad máxima de contenedore que puede cargar la nave. Se ha definido como una constante.

>  private int contenedores;
> 
> Esta variable es utilizada para los cálculos de los contenedores en los métodos:
> - load()
> - unload()

####- La clase tiene como métodos:

> public int load()
> 
> Este método tiene un condicional (if) de manera que la cantidad de contenedores no pase de la cantidad máxima de los mismos, de esta manera podrá sumar contenedores si el numero no es mayor o igual a 300.
> - Muestra un mensaje de error cuando el numero es mayor o igual a 300.
> - Finalmente devuelve con un return la cantidad de contenedores que hay en la nave.

> public int unload()
> 
> Este método al igual que el de load() tiene un condicional, nos permite controlar que no haya menos de 0 contenedores en la nave, que es cuando la nave está vacía.
> - Muestra un mensaje de error cuando el número de contenedores es menor o igual que 0.
> - Finalmente devuelve con un return la cantidad de contenedores que hay en la nave.
