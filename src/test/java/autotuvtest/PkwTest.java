package autotuvtest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PkwTest {
    @Test
    void testLosTrue() {
        Pkw auto = new Pkw(10.0, 5.0, 2026);
        assertTrue(auto.los());
    }
    @Test
    void testLosFalse() {
        Pkw auto = new Pkw(0.0, 5.0, 2026);
        assertFalse(auto.los());
    }
    @Test
    void testTuvTrue() {
        int currentYear = java.time.LocalDate.now().getYear();
        Pkw auto = new Pkw(10.0, 5.0, currentYear + 1);
        assertTrue(auto.tuvbis());
    }
    @Test
    void testTuvFalse() {
        int currentYear = java.time.LocalDate.now().getYear();
        Pkw auto = new Pkw(10.0, 5.0, currentYear - 1);
        assertFalse(auto.tuvbis());
    }

    @Test
    void testReichweite() {
        Pkw auto = new Pkw(50.0, 10.0, 2026);
        assertEquals(500.0, auto.reichweite());
    }

    @Test
    void testInfoOutput() {
        Pkw auto = new Pkw(40.0, 8.0, 2026);
        String expected = "Бак: 40.0 л, Витрата: 8.0 л/100км, Техогляд до: 2026";
        assertEquals(expected, auto.info());
    }

}