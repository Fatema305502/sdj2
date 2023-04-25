import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Ventevaerelse {
    private List<Person> personer = new ArrayList<>();

//regler:
    //Højst 10 personer throw IllegalStateException
    //Ved mere end  5 personer over 65 skal næste patient til lægen være over 65 år
    //Ingen personer over 100 år IllegalArgumentException

    public int antalPatienter() {
        return personer.size();
    }
    private int numberAbove65() {
        int retur = 0;
        for (Person p : personer) {
            if (p.getAlder() > 65) {
                retur++;
            }
        }
        return retur;
    }
    private Person getPersonAbove65() {
        for (int i = 0; i < personer.size(); i++) {
            if (personer.get(i).getAlder()>65) {
                return personer.remove(i);
            }
        }
        return null;
    }

    public void tilfoejPatient(Person p) {
        if (p.getAlder() > 100) {
            throw new IllegalArgumentException("Alder over 100");
        }

        if (personer.size()>=10) {
            throw new IllegalStateException("For mange personer");
        }
        personer.add(p);
    }
    public Person hentPatient() throws Exception {
        if (personer.isEmpty()) {
            throw new NoSuchElementException("Ingen patienter");
        }
        if(numberAbove65()>5) {
            return getPersonAbove65();
        } else {
            Person retur = personer.get(0);
            //personer.remove(0);
            return retur;
        }
    }

}
