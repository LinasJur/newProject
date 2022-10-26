public class TPVCADraudimas extends AutomobilioDraudimas{
    private String galiojimoTeritorija;
    public TPVCADraudimas(String apdraustojoVardas, double draudimoSuma) {
        super(apdraustojoVardas, draudimoSuma);
    }

    public TPVCADraudimas() {
        super();
    }

    public TPVCADraudimas(String linas) {
    }

    public TPVCADraudimas(String linas, int i, String abc484, String lietuva) {
    }

    public String getGaliojimoTeritorija() {
        return galiojimoTeritorija;
    }

    public void setGaliojimoTeritorija(String galiojimoTeritorija) {
        this.galiojimoTeritorija = galiojimoTeritorija;
    }

    @Override
    public String toString() {
        return "TPVCADraudimas{" +
                "galiojimoTeritorija='" + galiojimoTeritorija + '\'' +
                '}';
    }
}
