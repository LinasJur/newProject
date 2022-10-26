import java.util.HashMap;

public class PalletWarehouse {


   static int idenficationNum;
   static double weight;
   static String turinys;

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        PalletWarehouse.weight = weight;
    }

    public static String getTurinys() {
        return turinys;
    }

    public static void setTurinys(String turinys) {
        PalletWarehouse.turinys = turinys;
    }

    public static void setIdenficationNum(Integer idenficationNum) {
        PalletWarehouse.idenficationNum = idenficationNum;
    }

    public static int getIdenficationNum() {
        return idenficationNum;
    }
}
