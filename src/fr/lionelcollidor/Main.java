package fr.lionelcollidor;

import java.util.Scanner;

public class Main {
    // Variables
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        int convert = 0;
        String again;
        double temperature = 0;
        // End variables

        menu();
        do {
            convert = scanner.nextInt();

            switch (convert){
                case 1:
                    do {
                        again = "";

                        System.out.println("Saisissez la température à convertir :");
                        temperature = scanner.nextDouble();

                        System.out.println(temperature + " °C correspond à : "
                                + celsiusToFahrenheit(temperature)
                                + " °F.");

                        System.out.println("Souhaitez vous convertir une autre température ? (O/N)");
                        again = scanner.nextLine();

                    } while (again != "O" || again == "N");
                    break;
                case 2:
                    //TODO convertion fahrenheit en celsius
                    System.out.println("Fonctionnalité en cours de développement");
                    break;
                case 99:
                    System.out.println("Merci pour votre utilisation.");
                    break;
                default:
                    System.out.println("Choisissez le mode de conversion :");
                    break;
            }

        } while (convert != 99);

    }
    public static void menu(){
        System.out.println("Choisissez le mode de conversion :");
        System.out.println("\t1 - Convertisseur Celsius - Fahrenheit");
        System.out.println("\t2 - Convertisseur Fahrenheit - Celsius");
        System.out.println("\t99 - Convertisseur Fahrenheit - Celsius");
    }

    /**
     * Convertion d'une température celsius en fahrenheit en donnant la température avec un précision au centième près.
     * @param celsius la température en celsius
     * @return la température en fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius){
        return ( celsius * 9.0D/5.0D ) + 32.0D;
    }
}
