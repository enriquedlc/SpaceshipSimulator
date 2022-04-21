import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el nombre de tu nave: ");
        String nombre = scan.nextLine();

        System.out.print("Introduce la identificación de tu nave: ");
        String matricGalactica = scan.nextLine();

        System.out.print("¿Con qué aceleración recorrerás el espacio?: ");
        int aceleracion = scan.nextInt();

        SpaceShip createdShip = new SpaceShip(nombre, matricGalactica, aceleracion);

        String interfaz = "";

        while (!interfaz.equals("q")) {

            System.out.println("1. Acelerar la nave");
            System.out.println("2. Frenar la nave");
            System.out.println("3. Frenado de emergencia");
            System.out.println("q ----> Salir del programa");
            System.out.println(createdShip + "\n" + "\n" + "¿Qué quiere hacer con su nave?");

            interfaz = scan.nextLine();

            switch (interfaz) {
                case "1":
                    System.out.println("Acelerando...");
                    System.out.println(createdShip + "\n" + "\n" + "Su nave se encuentra en la coordenada: ("
                            + createdShip.speedUp() + ", 0)");
                    System.out.println("La velocidad de la nave es: " + createdShip.getVelocidadX());
                    break;
                case "2":
                    System.out.println("Frenando...");
                    System.out.println(createdShip + "\n" + "\n" + "Su nave se encuentra en la coordenada:  ("
                            + createdShip.brake() + ", 0)");
                    System.out.println("La velocidad de la nave es: " + createdShip.getVelocidadX());
                    break;
                case "3":
                    System.out.println("¡¡¡Frenando de emergencia!!!");
                    System.out.println(createdShip + "\n" + "\n" + "Su nave se encuentra en la coordenada:  ("
                            + createdShip.emergencyStop() + ", 0)");
                    System.out.println("La velocidad de la nave es: " + createdShip.getVelocidadX());
                    break;
                case "q":
                    System.out.println("Saliendo del programa...");
                    interfaz = "q";
                default:
                    System.out.println("Opción no existente, prueba un comando válido.");
            }
        }
    }
}
