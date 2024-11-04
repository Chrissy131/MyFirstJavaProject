import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextStatisticsTest {

    // Test 1: Kontrollera att tecken läggs till korrekt
    @Test
    void testAddCharacters() {
        TextStatistics stats = new TextStatistics();
        stats.addCharacters(10);
        assertEquals(10, stats.getTotalCharacters(), "Antal tecken borde vara 10.");
    }

    // Test 2: Kontrollera att radantalet ökar korrekt
    @Test
    void testIncrementLineCount() {
        TextStatistics stats = new TextStatistics();
        stats.incrementLineCount();
        assertEquals(1, stats.getLineCount(), "Antal rader borde vara 1.");
    }

    // Test 3: Kombinera tecken och radantal, lägg till tecken och öka radantalet
    @Test
    void testCombinedCharacterAndLineCount() {
        TextStatistics stats = new TextStatistics();
        stats.addCharacters(5);
        stats.incrementLineCount();
        stats.addCharacters(3);
        stats.incrementLineCount();

        assertEquals(8, stats.getTotalCharacters(), "Antal tecken borde vara 8.");
        assertEquals(2, stats.getLineCount(), "Antal rader borde vara 2.");
    }
}

//test
