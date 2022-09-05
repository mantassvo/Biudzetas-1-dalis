import java.time.LocalDate;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Biudzetas biudzetas = new Biudzetas();

        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;
        while (runProgram) {
            showOptions();
            String input = scanner.next();
            switch (input) {
                case "a":  {
                    float pajamuSuma;
                    System.out.println("Iveskite suma: ");
                    pajamuSuma = scanner.nextFloat();
                    String kategorija;
                    System.out.println("Iveskite pajamau kategorija (pvz. atlyginimas, ismoka, soc.parama...): ");
                    kategorija = scanner.next();
                    LocalDate data = LocalDate.now();
                    biudzetas.pridetiPajamuIrasa(pajamuSuma, kategorija, data );
                }
                case "b": {
                    float islaiduSuma;
                    System.out.println("Iveskite suma: ");
                    islaiduSuma = scanner.nextFloat();
                    String kategorija;
                    System.out.println("Iveskite islaidu kategorija: (pvz. laisvalaikis, maistas ir gerimai, transportas...): ");
                    kategorija = scanner.next();
                    String atsiskaitymoBudas;
                    System.out.println("Iveskite banko kortele ar grynais: ");
                    atsiskaitymoBudas = scanner.next();
                    String bankoKortele;
                    System.out.println("Banko korteles pavadinimas: ");
                    bankoKortele = scanner.next();
                    biudzetas.prdetiIslaiduIrasa(islaiduSuma, kategorija, atsiskaitymoBudas, bankoKortele);
                }
                case "c": runProgram = false;
            }
        }
        scanner.close();
    }

    private static void showOptions() {
        System.out.println("~~~~~ Pasirinkite ka norite prideti ~~~~~");
        System.out.printf("%5s - %-15s", "[a]", "PAJAMOS");
        System.out.printf("\n%5s - %-15s", "[b]", "ISLAIDOS");
        System.out.printf("\n%5s - %-15s", "[c]", "ATSAUKTI");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

}