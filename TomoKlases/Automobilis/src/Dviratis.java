public class Dviratis extends TransportoPriemone {
    int pavaruSkaicius;


    public String spausdink() {
        return "Dviratis{" +
                "pavaruSkaicius=" + pavaruSkaicius +
                '}';
    }

    public int getPavaruSkaicius() {
        return pavaruSkaicius;
    }

    public void setPavaruSkaicius(int pavaruSkaicius) {
        this.pavaruSkaicius = pavaruSkaicius;
    }

    public Dviratis(int ratuSk, String spalva, int pavaruSkaicius) {
        super(ratuSk, spalva);
        this.pavaruSkaicius = pavaruSkaicius;
    }

    public Dviratis(int ratuSk, String spalva) {
        super(ratuSk, spalva);
    }



}
