import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Failas {

public static void issaugokDuomenis(List<Irasas> irasai) throws IOException {
    PrintWriter irasom = null;
    try {
        FileWriter filewriter = new FileWriter( "/failas.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
        irasom = new PrintWriter(bufferedWriter);
        for (Irasas irasas : irasai){
            out.println(irasas.toCsv());
        }
    } catch (IOException e){
        out.println("Įrašyti į failą nepavyko.");
    } finally {
        irasom.close();
    }
}

public static List<Irasas> gaukDuomenis(){
    List<Irasas> irasai = new ArrayList<>();
    BufferedReader bufferedReader = null;
    try {
        File file = new File("/failas.csv");
        FileInputStream fileInputStream = new FileInputStream(file);
        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String eilute;
        while ((eilute = bufferedReader.readLine()) != null){
            irasai.add(irasaiIsCsv(eilute));
        }
    } catch (IOException e) {
        out.println("Nepavyko nuskaityti duomenų!");
    } finally {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            out.println("Nepavyko sėkmingai uždaryti bufferedReaderio!");
        }
    }
    return irasai;
}

    private static Irasas irasaiIsCsv(String csv) {
        String[] csvDuomenys = csv.split(",");
        Irasas irasas = null;
        if (PajamuIrasas.tipas.equals(csvDuomenys[0])) {
            PajamuIrasas pajamos = new PajamuIrasas();
            pajamos.setId(Double.parseDouble(csvDuomenys[1]));
            pajamos.setSuma(Double.parseDouble(csvDuomenys[2]));
            pajamos.setData(LocalDate.parse(csvDuomenys[3]));
            pajamos.setKomentaras(csvDuomenys[4]);
            pajamos.setKategorijos(PajamuKategorijos.katPagalNum(Integer.parseInt(csvDuomenys[5])));
            irasas = pajamos;
        } else if (IslaiduIrasas.tipas.equals(csvDuomenys[0])) {
            IslaiduIrasas islaidos = new IslaiduIrasas();
            islaidos.setId(Double.parseDouble(csvDuomenys[1]));
            islaidos.setSuma(Double.parseDouble(csvDuomenys[2]));
            islaidos.setData(LocalDate.parse(csvDuomenys[3]));
            islaidos.setKomentaras(csvDuomenys[4]);
            islaidos.setKategorijos(IslaiduKategorijos.katPagalNum(Integer.parseInt(csvDuomenys[5])));
            irasas = islaidos;
        }
        return irasas;
    }
}
