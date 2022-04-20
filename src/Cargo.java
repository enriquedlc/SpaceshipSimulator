public class Cargo extends SpaceShip {

    private static final int CARGA_MAXIMA = 300;
    private int contenedores;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int contenedores) {
        super(nombre, matriculaGalactica, aceleracion);
        this.contenedores = contenedores;
    }

    public int load() {
        if (contenedores >= CARGA_MAXIMA) {
            System.out.println("No hay más capacidad de carga en la nave ---> Capacidad máxima: " + CARGA_MAXIMA);
        } else {
            contenedores = contenedores + 1;
        }
        return  contenedores;
    }

    public int unload() {
        if (contenedores <= 0) {
            System.out.println("Los almacenes de carga están vacios, carga mercancía!!");
        } else {
            contenedores = contenedores - 1;
        }
        return  contenedores;
    }
}
