import java.util.Scanner;

public class Main {
    // Colores
    public static final String ROJO = "\u001B[31m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(AMARILLO + "----------------------------------------------------" + RESET);
        System.out.println(AMARILLO + "Bienvenidos al programa Hombres lobo de Castronegro" + RESET);
        System.out.println(AMARILLO + "----------------------------------------------------" + RESET);
        
        joc();
    }

    private static void joc() {
    }

    /**
     * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
     * @param message parametritzat per a mostrar a l'usuari
     * @param min valor min acceptat
     * @param max valor max acceptat
     * @return retorna un int
     */
    public static int readInt(String message, int min, int max) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        boolean correctValue;

        do {
            System.out.println(message);
            correctValue = input.hasNextInt();

            if (!correctValue) {
                System.out.println("ERROR: No es un valor correcto.");
                input.nextLine();
            } else {
                x = input.nextInt();
                input.nextLine();
                if (x < min || x > max) {
                    System.out.println("Opcion no valida");
                    correctValue = false;
                }
            }
        } while (!correctValue);

        return x;
    }

    /**
     * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
     * @param message parametritzat per a mostrar a l'usuari
     * @return retorna un float
     */
    public static float readFloat(String message) {
        Scanner input = new Scanner(System.in);

        float x = 0;
        boolean correctValue;

        do {
            System.out.print(message);
            correctValue = input.hasNextFloat();

            if (!correctValue) {
                System.out.println("ERROR: No es un valor numérico.");
                input.nextLine();
            } else {
                x = input.nextFloat();
                input.nextLine();
            }
        } while (!correctValue);

        return x;
    }


}