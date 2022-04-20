## SpaceShip

- La nave podrá acelerar con el método speedUp
- La nave podrá frenar con el método brake
- La nave podrá hacer un frenado de emergencia (dando a entender que la velocidad pasa a ser 0 cuando se aplique dicho método).

#### La funcionalidad de los métodos en las clases:

- Igualamos tanto la velocidad en X como la coordenada en X, ya que dependiendo del caso, sea el de frenar o el de acelerar se le resta o suma la aceleración dada por el usuario.
- A la coordenada en X siempre le sumamos la velocidad, porque así el programa es capaz de decirnos en qué punto del eje X se encuentra nuestra nave.
- Finalmente se devuelve el valor coordenadaX con un return.
#### Se tomó como referencia esta página para la elección del diseño de la nave: 

https://www.asciiart.eu/space/spaceships