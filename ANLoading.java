public class ANLoading {

    private ANLoading() {}

    // LOADING PRINCIPAL

    public static void showSpinner() {

        String[] spinner = {
            "o0o",
            "oo0",
            "0oo"
        };

        for (int i = 1; i <= 100; i++) {

            System.out.print(
                "\r"
                + spinner[(i - 1) % spinner.length]
                + " "
                + i
                + "%"
            );

            try {

                Thread.sleep(50);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }

    // LOADING PARA MOSTRAR EL CSV

    public static String showWaiting() {

        String[] spinner = {
            "o0o",
            "oo0",
            "0oo"
        };

        for (int i = 0; i < 3; i++) {

            System.out.print(
                "\r"
                + spinner[i]
            );

            try {

                Thread.sleep(100);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }
        }

        return "o0o";
    }

}