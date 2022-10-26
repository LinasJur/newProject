import java.util.Scanner;

public class Main  ex{

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Menu:");
        System.out.println("[1] - ivesti studenta:");
        System.out.println("[2] - gauti studenta pagal numeri:");
        System.out.println("[3] - baigti programa:");
        int variantas = Integer.parseInt(scanner.nextLine());
        Studentas studentas = null;


        switch (variantas) {
            case1:
            Studentas studentas = ivestiStudenta();
            break;
        }

        System.out.println(studentas);
    }
    private static Studentas ivestiStudenta() {
            System.out.println("iveskite: Varda " +
                    "/ Iveskite pavarde/" +
                    " Iveskite studento nr. " +
                    "/ Iveskite universiteta");
            String studentas = scanner.nextLine();
            String[] duomenys = studentas.split("/");

            String vardas = duomenys[0].trim();
            String pavarde = duomenys[1].trim();
            String studentasNr = duomenys[2].trim();
            String universitetas = duomenys[3].trim();

            Studentas studentas1 = new Studentas(studentasNr, vardas, pavarde, universitetas);


        }

    }
}
