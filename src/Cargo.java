public class Cargo extends SpaceShip{

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


}
