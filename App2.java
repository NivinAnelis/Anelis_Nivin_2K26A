public class App2 {

    public static void main(String[] args) {

        System.out.println(
            "[+] ACCESO:"
        );

        System.out.println(
            "1756881882 - Anelis Nivin"
        );

        System.out.println();

        System.out.println(
            "[+] COORDENADAS UCRANIANAS:"
        );

        System.out.println();

        // LOADING INICIAL

        ANLoading.showSpinner();

        System.out.println();

        // CONTROLADOR

        ANController controller =
                new ANController();

        controller.showFile(
                "NivinAnelis.csv"
        );

        System.out.println();

        System.out.println(
            "[+] BOMB-82:"
        );

        System.out.println();

        controller.boomCoordenada();

        System.out.println();

        CMD.pressKey();
    }
}