public class TransportoPriemone {
    static int ratuSk;
    static String spalva;

    public TransportoPriemone(int ratuSk, String spalva) {
        this.ratuSk = ratuSk;
        this.spalva = spalva;
    }

    public int getRatuSk() {
        return ratuSk;
    }

    public void setRatuSk(int ratuSk) {
        this.ratuSk = ratuSk;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    public static String spausdink(){
        System.out.println(
                "ratu skaicius: " + ratuSk
                        + "spalva: " + spalva );


        return null;
    }


}
