package fr.lionelcollidor;

import java.util.Scanner;

public class Main {
    // Variables globales
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // variables
        int convert = 0;
        String again;
        double temperature = 0;
        // Fin[] variables

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
                    do {
                        again = "";

                        System.out.println("Saisissez la température à convertir :");
                        temperature = scanner.nextDouble();

                        System.out.println(temperature + " °F correspond à : "
                                + fahrenheintToCelsius(temperature)
                                + " °C.");

                        System.out.println("Souhaitez vous convertir une autre température ? (O/N)");
                        again = scanner.nextLine();

                    } while (again != "O" || again == "N");
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
     * Convertion d'une température celsius en fahrenheit.
     * @param celsius la température en celsius à convertir
     * @return la température convertie en fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius){
        return ( celsius * 9.0D/5.0D ) + 32.0D;
    }

    /**
     * Convertion d'une température fahrenheit en celsius.
     * @param fahrenheit la température en fahrenheit à convertir
     * @return la température convertie en celsius
     */
    public static double fahrenheintToCelsius(double fahrenheit){
        return (fahrenheit - 32D) * 5D/9D;
    }
}
