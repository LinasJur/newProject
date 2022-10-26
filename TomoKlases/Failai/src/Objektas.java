public class Objektas implements Comparable{

    long id;
    String vardas;
    long amzius;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public long getAmzius() {
        return amzius;
    }

    public void setAmzius(long amzius) {
        this.amzius = amzius;
    }

    @Override
    public int compareTo(Object o) {
        
        return 0;
    }
}
