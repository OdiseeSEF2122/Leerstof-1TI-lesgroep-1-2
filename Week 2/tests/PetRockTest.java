import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    private PetRock rock;

    @Test
    void getName() {
        PetRock rock = new PetRock("Rocky");

        String result = rock.getName();

        assertEquals("Rocky", result);
    }

    @Test
    void isHappy_AfterCtor_NotHappy(){
        PetRock rock = new PetRock("Rocky");

        boolean result = rock.isHappy();

        assertFalse(result);
    }

    // naam bestaat uit drie delen
    // naam van de functie getest wordt in de act
    // begin situatie
    // en wat het eindresultaat moet zijn
    @Test
    void play_StoneNotHappy_IsHappyAfterPlaying(){
        // Arrange, Given

        // Act, When
        rock.play();

        // Assert, Then
        assertTrue(rock.isHappy());
        assertEquals(rock.getName(), "Rocky");

    }

    @BeforeEach
    public void setup(){
        rock = new PetRock("Rocky");
    }
}