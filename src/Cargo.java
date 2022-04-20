public class Cargo extends SpaceShip {

    private static final int CARGA_MAXIMA = 300;
    private int contenedores;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int contenedores) {
        super(nombre, matriculaGalactica, aceleracion);
        this.contenedores = contenedores;
    }

    public int getContenedores() {
        return contenedores;
    }

    public void setContenedores(int contenedores) {
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
}
