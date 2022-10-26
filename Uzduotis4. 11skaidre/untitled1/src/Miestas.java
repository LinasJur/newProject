public class Miestas {

    private String pavadinimas;

    public Miestas(String vilnius) {

    }

    public String getPavadinimas(String pavadinimas) {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public String toString() {
        return "Miestas{" +
                "pavadinimas='" + pavadinimas + '\'' +
                '}';
    }
}
