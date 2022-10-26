public class AutomobilioDraudimas extends Draudimas{
    private String automobilioValstNr;
    public AutomobilioDraudimas(String apdraustojoVardas, double draudimoSuma) {
        super(apdraustojoVardas, draudimoSuma);
    }

    public AutomobilioDraudimas() {
        super();
    }

    public String getAutomobilioValstNr() {
        return automobilioValstNr;
    }

    public void setAutomobilioValstNr(String automobilioValstNr) {
        this.automobilioValstNr = automobilioValstNr;
    }

    @Override
    public String toString() {
        return "AutomobilioDraudimas{" +
                "automobilioValstNr='" + automobilioValstNr + '\'' +
                '}';
    }
}
