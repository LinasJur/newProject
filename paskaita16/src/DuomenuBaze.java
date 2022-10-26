import java.util.HashMap;
import java.util.Map;

public class DuomenuBaze implements Saugykla{



    HashMap<Long , Info> mapas = new HashMap<>();



    @Override
    public void saugotiInfo(Info objektas) {
        mapas.put(objektas.getId(), objektas);
        System.out.println("Issaugoma i duomenu baze " + mapas);
    }

    @Override
    public Info rastiInfo(Long id) {

        System.out.println("Bando surasti pagal id: " + id);
        return mapas.get(id);
    }

    @Override
    public Info rastiInfo(String zodis) {
        for (Map.Entry<Long, Info> entry : mapas.entrySet()){
            if (entry.getValue().arYraTekste(zodis)){
                return entry.getValue();
            }
            System.out.println("Id = " + entry.getKey() + "Reiksme = " + entry.getValue());
            System.out.println("Bandoma rasti duomenu bazeje pagal zodi: ");

        }
        return null;
    }
}