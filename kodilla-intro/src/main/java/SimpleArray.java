public class SimpleArray {
    public static void main(String[] args) {

        String[] joannaChylkaSeria = new String[15];

        joannaChylkaSeria[0] = "Kasacja";
        joannaChylkaSeria[1] = "Zaginięcie";
        joannaChylkaSeria[2] = "Rewizja";
        joannaChylkaSeria[3] = "Immunitet";
        joannaChylkaSeria[4] = "Inwigilacja";
        joannaChylkaSeria[5] = "Oskarżenie";
        joannaChylkaSeria[6] = "Testament";
        joannaChylkaSeria[7] = "Kontratyp";
        joannaChylkaSeria[8] = "Umorzenie";
        joannaChylkaSeria[9] = "Wyrok";
        joannaChylkaSeria[10] = "Ekstradycja";
        joannaChylkaSeria[11] = "Precedens";
        joannaChylkaSeria[12] = "Afekt";
        joannaChylkaSeria[13] = "Egzekucja";
        joannaChylkaSeria[14] = "Skazanie";

        String joannaChylkabest = joannaChylkaSeria[2];

        System.out.println(joannaChylkabest);

        int iloscKsiazek = joannaChylkaSeria.length;

        System.out.println(iloscKsiazek);

    }
}
