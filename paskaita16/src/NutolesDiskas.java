import java.util.ArrayList;

public class NutolesDiskas implements Saugykla{

    ArrayList<Info> arrejus = new ArrayList<>();






    @Override
    public void saugotiInfo(Info objektas) {
        arrejus.add(objektas);

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
