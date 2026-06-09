import java.util.Scanner;

public class CMD {

    static Scanner sc = new Scanner(System.in);

    private CMD() { }

    // LIMPIAR CONSOLA

    public static void clear() {

        try {

            String operatingSystem =
                    System.getProperty("os.name");

            if (operatingSystem.contains("Windows")) {

                new ProcessBuilder(
                        "cmd",
                        "/c",
                        "cls"
                ).inheritIO().start().waitFor();

            } else {

                new ProcessBuilder(
                        "clear"
                ).inheritIO().start().waitFor();
            }

        } catch (Exception e) {

            // Ignorar error
        }
    }

    // LEER NUMERO POSITIVO

    public static int getNumeroPositivo(
            String etiqueta) {

        int n = -1;
        String str;

        do {

            System.out.print(etiqueta);

            str = sc.next();

            try {

                n = Integer.parseInt(str);

            } catch (Exception e) {

                System.out.println(
                    "Valor no valido..."
                );
            }

        } while (n < 0);

        return n;
    }

    // LEER TEXTO

    public static String getCaracteres(
            String etiqueta) {

        String str = "";

        do {

            System.out.print(etiqueta);

            str = sc.next().trim();

            if (str.isEmpty()) {

                System.out.println(
                    "Valor no valido..."
                );
            }

        } while (str.isEmpty());

        return str;
    }

    // PAUSA

    public static void pressKey() {

        System.out.print(
            "\nPresione ENTER para continuar..."
        );

        try {

            System.in.read();

        } catch (Exception e) {

            // Ignorar error
        }
    }
}