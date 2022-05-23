package oefTijdspanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TijdspanneTest {

    @Test
    void bijTellen_tijdspanne2en3_Geeft5() {
        Tijdspanne t1=new Tijdspanne(2);
        Tijdspanne t2=new Tijdspanne(3);

        t1.bijTellen(t2);
        assertEquals(5,t1.getMinuten());
    }
    @Test
    void bijTellen_preciezeTijdspanne_GeeftCorrecteTijdspanne() {
        Tijdspanne t1=new Tijdspanne(2);
        PreciezeTijdspanne t2=new PreciezeTijdspanne(3,6);

        t1.bijTellen(t2);
        assertEquals(5,t1.getMinuten());
    }


}