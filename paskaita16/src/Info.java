public class Info implements Saugykla {

    private Long id;
    private String tekstas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTekstas() {

        return tekstas;
    }

    public void setTekstas(String tekstas) {

        this.tekstas = tekstas;
    }

    @Override
    public String toString() {
        return "Info[" +
                "id: " + id +
                ", tekstas: '" + tekstas + '\'' +
                ']';
    }
    private static void arYraTekste(){

    }

    public Info(Long id, String tekstas) {
        super();
        this.id = id;
        this.tekstas = tekstas;
    }
    boolean arYraTekste(String zodis) {
        if (tekstas.contains(zodis)) {
            return true;
        } return false;

    }


    @Override
    public void saugotiInfo(Info objektas) {

    }

    @Override
    public Info rastiInfo(Long id) {
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        return null;
    }
}
