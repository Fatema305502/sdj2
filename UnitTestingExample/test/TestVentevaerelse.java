import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestVentevaerelse {

    @Test
    public void tilfoejPatient() {
        //Arrange
        testPersonUnder100(30);
        //Or just ventesal.tilfoejPatient(new Person("Ole", 30))
        // This gives exception, the other fails
    }

    @Test
    public void hentPatientVedTomVentesal() {
        //Arrange
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        //act og assert
        assertThrows(NoSuchElementException.class, () -> ventevaerelse.hentPatient());
    }

    @Test
    public void hentPatientVedEnIVentevaerelse() {
        //Arrange
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        //act
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        //assert
        assertDoesNotThrow(() -> ventevaerelse.hentPatient());
    }

    @Test
    public void over10Patienter() {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        for (int i = 0; i < 10; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole " + i, i));
        }
        try {
            ventevaerelse.tilfoejPatient(new Person("Ole " + 10, 10));
            fail("IllegalStateException not thrown");
        } catch (IllegalStateException ex) {
        }
    }

    @Test
    public void personPaa50() {
        testPersonUnder100(50);
    }

    private void testPersonUnder100(int i) {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        assertDoesNotThrow(() -> ventevaerelse.tilfoejPatient(new Person("Ole", i)));
    }

    @Test
    public void personPaa99() {
        testPersonUnder100(99);
    }

    @Test
    public void personPaa100() {
        testPersonUnder100(100);
        //Or just ventesal.tilfoejPatient(new Person("Ole", 100))
        // This gives exception, the other fails
    }

    @Test
    public void personOver100() {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        assertThrows(IllegalArgumentException.class, () -> ventevaerelse.tilfoejPatient(new Person("Ole", 101)));
    }

    @Test
    public void under5PatienterPaa65() throws Exception {
        //Arrange
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        //Act
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 3; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole", 65));
        }
        //Assert
        Person foerst;
        foerst = ventevaerelse.hentPatient();
        assertEquals(20, foerst.getAlder());
        assertEquals("Ib", foerst.getName(), "Navnet var forkert på første patient");

        //No go:
        //assertTrue("Ib".equals((foerst.getName())), "Navnet var forkert på første patient");
    }

    @Test
    public void under5PatienterPaa66() throws Exception {
        //Arrange
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        //Act
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 3; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole", 66));
        }
        //Assert
        Person foerst;
        foerst = ventevaerelse.hentPatient();
        assertEquals(20, foerst.getAlder());
        assertEquals("Ib", foerst.getName(), "Navnet var forkert på første patient");

        //No go:
        //assertTrue("Ib".equals((foerst.getName())), "Navnet var forkert på første patient");
    }


    @Test
    public void praecist5PatienterPaa65() {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 5; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole", 65));
        }
        Person foerst = null;
        try {
            foerst = ventevaerelse.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals(20, foerst.getAlder());
    }

    @Test
    public void praecist5PatienterPaa66() {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 5; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole" + i, 66));
        }
        Person foerst = null;
        try {
            foerst = ventevaerelse.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals("Ib", foerst.getName());
    }

    @Test
    public void praecist6PatienterPaa65() {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 6; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole", 65));
        }
        Person foerst = null;
        try {
            foerst = ventevaerelse.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals(20, foerst.getAlder());
    }

    @Test
    public void praecist6PatienterPaa66() {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 6; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole" + i, 66));
        }
        Person foerst = null;
        try {
            foerst = ventevaerelse.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals("Ole0", foerst.getName());
    }

    @Test
    public void praecist8PatienterOver65() throws Exception {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 8; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole " + i, 70 + i));
        }
        Person foerst = null;
        foerst = ventevaerelse.hentPatient();
        assertEquals(70, foerst.getAlder());
    }

    @Test
    public void praecist6PatienterOver65() {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        ventevaerelse.tilfoejPatient(new Person("Ib", 20));
        for (int i = 0; i < 6; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole", 70 + i));
        }
        Person foerst = null;
        try {
            foerst = ventevaerelse.hentPatient();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals(70, foerst.getAlder());
    }

    @Test
    public void testHentPatientFjernerPatient() throws Exception {
        Ventevaerelse ventevaerelse = new Ventevaerelse();
        for (int i = 0; i < 6; i++) {
            ventevaerelse.tilfoejPatient(new Person("Ole", 30 + i));
        }
        ventevaerelse.hentPatient();
        assertEquals(5, ventevaerelse.antalPatienter(), "Forkert antal");
    }

}
