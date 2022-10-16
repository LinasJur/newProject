import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Biudzetas biudzetas = new Biudzetas();


        Scanner sc = new Scanner(System.in);


        boolean continueProgram = true;

        while (continueProgram) {
            int userInput = mainMeniu(sc);
            switch (userInput) {
                case 1:
                    int inputMeniu = entryMeniu(sc);
                    switch (inputMeniu) {
                        case 1:
                            int add = addEntry(sc);
                            switch (add) {
                                case 1:
                                    biudzetas.pridetiIrasa(pridetiNaujaPajamuIrasa(sc));
                                    break;
                                case 2:
                                    biudzetas.pridetiIrasa(pridetiNaujaIslaiduIrasa(sc));
                                    break;
                            }
                            break;
                        case 2:
                            int get = getEntry(sc);
                            switch (get) {
                                case 1:
                                    spausdink(biudzetas.gautiPajamuIrasus());
                                    break;
                                case 2:
                                    spausdink(biudzetas.gautiIslaiduIrasus());
                                    break;
                                case 3:
                                    spausdink(biudzetas.visiIrasai());
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Pasirinkite kurį įrašą norite ištrinti, tai padaryti galite nurodžius įrašo ID: ");
                            trinti(sc , biudzetas);
                            break;
                        case 4:
                            atnaujintiIrasa(sc, biudzetas);
                            break;
                    }
                    break;
                case 2:
                    gautiBalansa(biudzetas);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    continueProgram = false;
                    break;
            }
        }
        sc.close();
    }

    private static void atnaujintiIrasa(Scanner sc, Biudzetas biudzetas) {
        System.out.println("Įveskite ID to įrašo, kurį norite redaguoti:");

    }

    private static void trinti(Scanner sc, Biudzetas biudzetas) {
        System.out.println("Įveskite trinamo įrašo ID:");
        double trinamasID = getSum(sc);
        biudzetas.trinkIrasa(trinamasID);
    }

    private static void gautiBalansa(Biudzetas biudzetas) {
        double balansas = biudzetas.balansas();
        System.out.println(String.format("Jūsų balansas šiuo metu yra: %2s pinigai.", balansas));
    }

    public static int mainMeniu(Scanner scanner) {
        System.out.println("************ MENIU ************\n" +
                "[1] Įrašai:\n" +
                "[2] Balansas:\n" +
                "[3] Gauti iš failo:\n" +
                "[4] Saugoti į failą:\n" +
                "[5] Išeiti iš programos!");
        return userInput(scanner, 1, 2, 3, 4, 5);
    }

    public static int entryMeniu(Scanner scanner) {
        System.out.println(
                "[1] Ivesti irasa:\n" +
                "[2] Gauti irasa:\n" +
                "[3] Trinti irasa:\n" +
                "[4] Redaguoti irasa:");
        return userInput(scanner, 1, 2, 3, 4);
    }

    public static int addEntry(Scanner scanner) {
        System.out.println(
                "[1] Prideti pajamu irasa: \n" +
                "[2] Prideti islaidu irasa: ");
        return userInput(scanner, 1, 2);
    }

    public static int getEntry(Scanner scanner) {
        System.out.println(
                "[1] Gauti pajamų įrašą:\n" +
                "[2] Gauti išlaidų įrašą:\n" +
                "[3] Gauti visus įrašus:");
        return userInput(scanner, 1, 2, 3);
    }

    public static void spausdink(List<Irasas> irasai) {
        for (Irasas irasas : irasai) {
            System.out.println(irasas);
        }
    }

    private static int userInput(Scanner scanner, int... validNumbers) {
        int input = 0;
        boolean noEntry = true;
        while (noEntry) {
            String inputInfo = scanner.nextLine();
            try {
                input = Integer.parseInt(inputInfo);
                if (validNumbers.length == 0 || validNumber(validNumbers, input)) {
                    noEntry = false;
                } else {
                    System.out.println("Tokio pasirinkimo nera: ");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Įvedėte ne skaičių, prašome pakartoti dar kartą!");
            }
        }
        return input;
    }

    private static boolean validNumber(final int[] validNumbers, final int number) {
        boolean result = false;
        for (int i : validNumbers) {
            if (i == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static Irasas pridetiNaujaPajamuIrasa(Scanner scanner) {
        PajamuIrasas pajamuIrasas = new PajamuIrasas();
        System.out.println("Iveskite sumą:");
        pajamuIrasas.setSuma(getSum(scanner));
        pajamuIrasas.setData(LocalDate.now());
        System.out.println(" Pasirinkite kategorija:");
        for (PajamuKategorijos pk : PajamuKategorijos.values()) {
        System.out.println(pk);
        }
        pajamuIrasas.setKategorijos(pajamuKategorijosPasirinkimas(scanner));
        System.out.println("Iveskite papildoma informacija");
        pajamuIrasas.setKomentaras(gaukTeksta(scanner));
        return pajamuIrasas;
    }
    private static Irasas pridetiNaujaIslaiduIrasa(Scanner scanner) {
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas();
        System.out.println("Iveskite sumą:");
        islaiduIrasas.setSuma(getSum(scanner));
        islaiduIrasas.setData(LocalDate.now());
        System.out.println(" Pasirinkite kategorija:");
        for (IslaiduKategorijos ik : IslaiduKategorijos.values()) {
            System.out.println(ik);
        }
        islaiduIrasas.setKategorijos(islaiduKategorijosPasirinkimas(scanner));
        System.out.println("Iveskite papildoma informacija");
        islaiduIrasas.setKomentaras(gaukTeksta(scanner));
        return islaiduIrasas;
    }

    private static IslaiduKategorijos islaiduKategorijosPasirinkimas(Scanner scanner) {
        IslaiduKategorijos kategorijos = null;
        boolean entry = true;
        while (entry) {
            String inputKategory = scanner.nextLine();
            try {
                int num = Integer.parseInt(inputKategory);
                kategorijos = IslaiduKategorijos.katPagalNum(num);
                if (kategorijos != null) {
                    entry = false;
                } else {
                    System.out.println("Tokios kategorijos nerasta");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Klaida, įvedėte ne skaičiu, prašome vesti dar kartą!");
            }
        }
        return kategorijos;
    }


    private static String gaukTeksta(Scanner scanner) {
        String tekstas = scanner.nextLine();
        return tekstas;
    }

    public static double getSum(Scanner scanner) {
        double suma = 0;
        boolean noInfoEntered = true;
        while (noInfoEntered) {
            String someInfo = scanner.next();
            try {
                suma = Double.parseDouble(someInfo);
                noInfoEntered = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Įvestas ne skaičius, prašome įvesti skaičių.");
            }
        }
        return suma;
    }

    private static PajamuKategorijos pajamuKategorijosPasirinkimas(Scanner scanner) {
        PajamuKategorijos kategorija = null;
        boolean entry = true;
        while (entry) {
            String inputKategory = scanner.nextLine();
            try {
                int num = Integer.parseInt(inputKategory);
                kategorija = PajamuKategorijos.katPagalNum(num);
                if (kategorija != null) {
                    entry = false;
                } else {
                    System.out.println("Tokios kategorijos nerasta");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Klaida, įvedėte ne skaičiu, prašome vesti dar kartą!");
            }
        }
        return kategorija;
    }
}