public class KaskoDraudimas extends AutomobilioDraudimas{
    private double frasize;
    public KaskoDraudimas(String apdraustojoVardas, double draudimoSuma) {
        super(apdraustojoVardas, draudimoSuma);
    }

    public KaskoDraudimas() {

    }

    public KaskoDraudimas(String petras, int i, String ddd123, String estija) {
    }

    public double getFrasize() {
        return frasize;
    }

    public void setFrasize(double frasize) {
        this.frasize = frasize;
    }

    @Override
    public String toString() {
        return "KaskoDraudimas{" +
                "frasize=" + frasize +
                '}';
    }
}
