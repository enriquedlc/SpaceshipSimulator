public class SpaceShip {

    private String nombre;
    private String matriculaGalactica;
    private int aceleracion;
    private int velocidadX = 0;
    private int velocidadY = 0;
    private int coordenadaX = 0;
    private int coordenadaY = 0;
    private int direccionX = 0;
    private int direccionY = 0;

    public SpaceShip(String nombre,
                     String matriculaGalactica,
                     int aceleracion) {

        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
    }

    public int speedUp() {
        velocidadX = velocidadX + aceleracion;
        coordenadaX = coordenadaX + velocidadX;
        return coordenadaX;
    }

    @Override
    public String toString() {
        return "  ____\n" +
                "                /___.`--.____ .--. ____.--(\n" +
                "                       .'_.- (    ) -._'.\n" +
                "                     .'.'    |'..'|    '.'.\n" +
                "              .-.  .' /'--.__|____|__.--'\\ '.  .-.\n" +
                "             (O).)-| |  \\    |    |    /  | |-(.(O)\n" +
                "              `-'  '-'-._'-./      \\.-'_.-'-'  `-'\n" +
                "                 _ | |   '-.________.-'   | | _\n" +
                "              .' _ | |     |   __   |     | | _ '.\n" +
                "             / .' ''.|     | /    \\ |     |.'' '. \\\n" +
                "             | |( )| '.    ||      ||    .' |( )| |\n" +
                "             \\ '._.'   '.  | \\    / |  .'   '._.' /\n" +
                "              '.__ ______'.|__'--'__|.'______ __.'\n" +
                "             .'_.-|         |------|         |-._'.\n" +
                "            //\\\\  |         |--::--|         |  //\\\\\n" +
                "           //  \\\\ |         |--::--|         | //  \\\\\n" +
                "          //    \\\\|        /|--::--|\\        |//    \\\\\n" +
                "         / '._.-'/|_______/ |--::--| \\_______|\\`-._.' \\\n" +
                "        / __..--'        /__|--::--|__\\        `--..__ \\\n" +
                "       / /               '-.|--::--|.-'               \\ \\\n" +
                "      / /                   |--::--|                   \\ \\\n" +
                "     / /                    |--::--|                    \\ \\\n" +
                " _.-'  `-._                 _..||.._                  _.-` '-._\n" +
                "'-..__..--'bitcoin efectivo'-.____.-' carro depoltivo'--..__..-'";
    }
}
