package Uzduotis3;

public class Asmuo {
    String vardas;
    String pavarde;

    public void asmuo(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public String toString() {
        return "Asmuo{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                '}';
    }
}
