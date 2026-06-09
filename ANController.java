import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ANController {

    List<String> allLines;

    // MOSTRAR CSV CON LOADING

    public void showFile(String pathFile) {

        Path path = Paths.get(pathFile);

        try {

            allLines = Files.readAllLines(path);

            for (String line : allLines) {

                System.out.println(
                    ANLoading.showWaiting()
                    + " 100% | "
                    + line
                );
            }

        } catch (IOException e) {

            System.out.println(
                "Error al leer el archivo CSV"
            );
        }
    }

    // BUSCAR COORDENADAS VALIDAS

    public void boomCoordenada() {

        if (allLines == null) {

            System.out.println(
                "Primero debe cargarse el archivo."
            );

            return;
        }

        ANBomba bomba = new ANBomba();

        System.out.println();
        System.out.println(
            "Geoposicion\tTipo Arsenal"
        );

        boolean cabecera = true;

        for (String line : allLines) {

            if (cabecera) {

                cabecera = false;
                continue;
            }

            String[] columnas = line.split(",");

            if (columnas.length < 7)
                continue;

            String geoposicion =
                    columnas[0].trim();

            String arsenal =
                    columnas[6].trim();

            if (arsenal.isEmpty())
                continue;

            if (bomba.goBoom(
                    arsenal + "-"
            )) {

                System.out.println(
                    geoposicion
                    + "\t\t"
                    + arsenal
                );
            }
        }
    }
}