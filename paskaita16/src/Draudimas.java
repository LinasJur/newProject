public class Draudimas {

    private String apdraustojoVardas;
    private double draudimoSuma;
    public Draudimas(String apdraustojoVardas, double draudimoSuma){
        super();
        this.apdraustojoVardas = apdraustojoVardas;
        this.draudimoSuma = draudimoSuma;
    }

    public Draudimas() {

    }

    public String getApdraustojoVardas() {
        return apdraustojoVardas;
    }

    public void setApdraustojoVardas(String apdraustojoVardas) {
        this.apdraustojoVardas = apdraustojoVardas;
    }

    public double getDraudimoSuma() {
        return draudimoSuma;
    }

    public void setDraudimoSuma(double draudimoSuma) {
        this.draudimoSuma = draudimoSuma;
    }

    @Override
    public String toString() {
        return "Draudimas{" +
                "apdraustojoVardas='" + apdraustojoVardas + '\'' +
                ", draudimoSuma=" + draudimoSuma +
                '}';
    }
}
