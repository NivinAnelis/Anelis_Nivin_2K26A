public class App {

    public static void main(String[] args) {

        // =========================
        // LOGIN
        // =========================

        String usuario =
                CMD.getCaracteres("Usuario: ");

        String password =
                CMD.getCaracteres("Password: ");

        boolean acceso = false;

        if ((usuario.equals("Nivin")
                && password.equals("1234"))
            ||
            (usuario.equals("pat_mic")
                && password.equals("1234"))) {

            acceso = true;
        }

        if (!acceso) {

            System.out.println(
                "\nACCESO DENEGADO"
            );

            return;
        }

        // =========================
        // ACCESO
        // =========================

        System.out.println();
        System.out.println(
            "[+] ACCESO:"
        );

        System.out.println(
            "1756881882 - Anelis Nivin"
        );

        System.out.println();

        // =========================
        // LOADING
        // =========================

        ANLoading.showSpinner();

        System.out.println();

        // =========================
        // CSV
        // =========================

        System.out.println(
            "[+] COORDENADAS UCRANIANAS:"
        );

        System.out.println();

        ANController controller =
                new ANController();

        controller.showFile(
                "NivinAnelis.csv"
        );

        // =========================
        // BOMBA
        // =========================

        System.out.println();
        System.out.println(
            "[+] BOMB-82"
        );

        ANBomba bomba =
                new ANBomba();

        String arsenal =
                CMD.getCaracteres(
                    "\nIngrese arsenal: "
                );

        if (bomba.goBoom(
                arsenal + "-"
        )) {

            System.out.println(
                "\nBOOM!"
            );

        } else {

            System.out.println(
                "\nNo explota..."
            );
        }

        // =========================
        // PAUSA
        // =========================

        CMD.pressKey();
    }
}