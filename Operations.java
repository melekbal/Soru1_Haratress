import java.util.Scanner;

public class Operations {
    private Scanner scanner = new Scanner(System.in);

    public int getMaxChar() {
        System.out.print("Maksimum karakter sayısı belirleyin: ");
        int maxChar = scanner.nextInt();
        scanner.nextLine();
        return maxChar;
    }

    public String getValidatedText(int maxChar) {
        String text;
        do {
            System.out.print("Cümle girin: ");
            text = scanner.nextLine();

            if (text.length() > maxChar) {
                System.out.println("Girdiğiniz cümle " + maxChar + " karakterden uzun olamaz. Lütfen tekrar deneyin.");
            }

        } while (text.length() > maxChar);

        return text;
    }
}
