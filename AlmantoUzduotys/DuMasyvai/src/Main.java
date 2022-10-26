import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //parasyti metoda, kuris priimtu du bet kokio tipo masyvus.
        //main metode aprasyti masyvus ir pakviesti metoda.
        //metodo viduje is pirmo masyvo pasalintu visus objektus, kurie yra antrame masyve.
        //tada main metode atspausdinti apdoroto masyvo turini


        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(4);
        b.add(1);
        b.add(2);


        removeDublicate(a, b);
        System.out.println(a);

    }
    private static <T> void removeDublicate(Collection<T> arrayCollection, Collection<T> listRemove) {
        arrayCollection.removeAll(listRemove);
    }

}
