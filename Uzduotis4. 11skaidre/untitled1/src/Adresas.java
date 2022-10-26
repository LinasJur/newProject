public class Adresas {

    private Miestas miestas;

    public Adresas(Miestas vilnius) {

    }

    public Miestas getMiestas( String pavadinimas) {
        return miestas;
    }

    public void setMiestas(Miestas miestas) {
        this.miestas = miestas;
    }

    @Override
    public String toString() {
        return "Adresas{" +
                "miestas=" + miestas +
                '}';
    }
}
