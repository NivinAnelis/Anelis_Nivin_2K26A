public class ANBomba {

    // ALFABETO
    static final String alfabeto = "abc-";

    // ESTADOS ESPECIALES
    static final int e = -10; // error
    static final int b = 100; // boom

    // MATRIZ DE TRANSICION
    //          a    b    c    -
    static final int[][] mt = {

        /* q0 */ {1,   e,   e,   e},
        /* q1 */ {e,   2,   e,   e},
        /* q2 */ {e,   2,   3,   b},
        /* q3 */ {e,   e,   e,   b}

    };

    // OBTENER POSICION EN EL ALFABETO

    private int getIndexAlfabeto(char arsenal) {

        for (int i = 0; i < alfabeto.length(); i++) {

            if (arsenal == alfabeto.charAt(i)) {
                return i;
            }

        }

        return e;
    }

    // VALIDAR ARSENAL

    public boolean goBoom(String tipoArsenal) {

        int q = 0;
        int c = 0;

        for (int i = 0; i < tipoArsenal.length(); i++) {

            c = getIndexAlfabeto(
                    tipoArsenal.charAt(i)
            );

            if (c == e) {
                return false;
            }

            if (mt[q][c] == e) {
                return false;
            }

            q = mt[q][c];
        }

        return q == b;
    }

}