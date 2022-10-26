import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaiciuokleTest {


    @Test
    void kvadratu() {
        double a = 7;
        double expected = 49;
        double rez =  Skaiciuokle.kvadratu(7);
        assertEquals(expected, rez);
    }

    @Test
    void saknis() {
        double a = 9;
        double expected = 3;
        double rez = Skaiciuokle.saknis(9);
        assertEquals(expected, rez);
    }
}