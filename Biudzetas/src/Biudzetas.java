import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biudzetas {



    static Scanner sc = new Scanner(System.in);
    int pridekPajamas = 0;
    int pridekIslaidas = 0;

    List<Irasas> irasai = new ArrayList<Irasas>();



    public void pridetiIrasa(Irasas irasas){
        this.irasai.add(irasas);

    }

    public List<Irasas> gautiPajamuIrasus(){
        List<Irasas> pajamuSarasas = new ArrayList<>();
        for (Irasas irasas : irasai){
            if (irasas instanceof PajamuIrasas){
                pajamuSarasas.add(irasas);
            }
        }
        return pajamuSarasas;
    }
    public List<Irasas> gautiIslaiduIrasus(){
        List<Irasas> islaiduSarasas = new ArrayList<>();
        for (Irasas irasas : irasai){
            if (irasas instanceof IslaiduIrasas){
                islaiduSarasas.add(irasas);
            }
        }
        return islaiduSarasas;
    }
    public double balansas (){
        double balansas = 0;
       for (Irasas irasas : irasai){
           if (irasas instanceof PajamuIrasas){
               balansas += irasas.getSuma();
           } else if (irasas instanceof IslaiduIrasas){
               balansas -= irasas.getSuma();
           }
       }
        return balansas;
    }

    public List<Irasas> visiIrasai() {
        return irasai;
    }

    public boolean trinkIrasa(double id) {
        Irasas trinamasIrasas = new Irasas();
        trinamasIrasas.setId(id);
        return irasai.remove(trinamasIrasas);
    }
    public boolean atnaujintiIrasa(Irasas irasas){
        trinkIrasa(irasas.getId());
        return irasai.add(irasas);
    }
}



