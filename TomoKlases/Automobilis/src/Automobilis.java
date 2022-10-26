public class Automobilis extends TransportoPriemone{

    double variklioTuris;
    int cilindruSk;

    @Override
    public String toString() {
        return "Automobilis{" +
                "variklioTuris=" + variklioTuris +
                ", cilindruSk=" + cilindruSk +
                '}';
    }

    public Automobilis(int ratuSk, String spalva, double variklioTuris, int cilindruSk) {
        super(ratuSk, spalva);
        this.variklioTuris = variklioTuris;
        this.cilindruSk = cilindruSk;
    }

    public double getVariklioTuris() {
        return variklioTuris;
    }

    public void setVariklioTuris(double variklioTuris) {
        this.variklioTuris = variklioTuris;
    }

    public int getCilindruSk() {
        return cilindruSk;
    }

    public void setCilindruSk(int cilindruSk) {
        this.cilindruSk = cilindruSk;
    }



    public Automobilis(int ratuSk, String spalva) {

        super(ratuSk, spalva);
    }




}
