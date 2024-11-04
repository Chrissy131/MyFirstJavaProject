import java.util.Scanner;

// Klass 2: TextHandler
class TextHandler {

    // Main-metoden för att starta programmet
    public static void main(String[] args) {
        TextHandler handler = new TextHandler();
        handler.readInput();
    }

    private TextStatistics stats = new TextStatistics();
    private Scanner scanner = new Scanner(System.in);

    // Kör inläsningsprocessen
    public void readInput() {
        String input;

        while (true) {
            System.out.print("Skriv något (eller 'stop' för att avsluta): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            stats.addCharacters(input.length());
            stats.incrementLineCount();
        }

        printStatistics();
    }

    // Skriv ut statistik efter avslut
    private void printStatistics() {
        System.out.println("Antal rader: " + stats.getLineCount());
        System.out.println("Antal tecken: " + stats.getTotalCharacters());
    }
}
