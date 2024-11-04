// Klass 1: TextStatistics
class TextStatistics {
    private int totalCharacters = 0;
    private int lineCount = 0;

    // Öka teckenräknaren
    public void addCharacters(int count) {
        totalCharacters += count;
    }

    // Öka radantalet
    public void incrementLineCount() {
        lineCount++;
    }

    // Returnerar totalt antal tecken
    public int getTotalCharacters() {
        return totalCharacters;
    }

    // Returnerar antal rader
    public int getLineCount() {
        return lineCount;
    }
}
