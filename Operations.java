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

    public boolean getCaseSensitive() {
        String response;
        while (true) {
            System.out.print("Büyük/küçük harf duyarlılığı aktif olsun mu? (Evet/Hayır): ");
            response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("Evet")) {
                return true;
            } else if (response.equals("Hayır")) {
                return false;
            } else {
                System.out.println("Lütfen geçerli bir cevap giriniz.");
            }
        }
    }
}
