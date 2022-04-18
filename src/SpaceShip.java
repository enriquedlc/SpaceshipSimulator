public class SpaceShip {

    private String nombre;
    private String matriculaGalactica;
    private float aceleracion;
    private float velocidadX = 0;
    private float velocidadY = 0;
    private int coordenadaX = 0;
    private int coordenadaY = 0;
    private int direccionX = 0;
    private int direccionY = 0;

    public SpaceShip(String nombre,
                     String matriculaGalactica,
                     float aceleracion) {

        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
    }
}
