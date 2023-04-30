package pol.estival.dam.mp09.uf02.a01;
public class Main {
    public static void main(String[] args) {

        EntornJoc entornJoc = new EntornJoc(1597, 987, 610);

        ElementJoc elementMeteorit = new ElementJoc("Meteorit", "meteorit.png");
        ElementJoc elementPanta = new ElementJoc("Panta", "panta.png");
        ElementJoc elementOrc = new ElementJoc("Orc", "orc.png");
        ElementJoc elementVolca = new ElementJoc("Volca", "volca.png");

        EventJoc event1 = new EventJoc(entornJoc, elementMeteorit, 4, null);
        EventJoc event2 = new EventJoc(entornJoc, elementPanta, 5, 3);
        EventJoc event3 = new EventJoc(entornJoc, elementOrc, 2, 6);
        EventJoc event4 = new EventJoc(entornJoc, elementVolca, 7, null);

        event1.start();
        event2.start();
        event3.start();
        event4.start();

    }
    
}