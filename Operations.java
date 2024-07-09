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

    public boolean getCaseSensitivity() {
        boolean isCaseSensitive;
        do {
            System.out.print("Büyük/küçük harf duyarlılığı aktif olsun mu? (E/H): ");
            String response = scanner.nextLine().trim();

            if (response.equals("E")) {
                isCaseSensitive = true;
                break;
            }
            if (response.equals("H")) {
                isCaseSensitive = false;
                break;
            } else {
                System.out.println("Lütfen geçerli bir cevap giriniz.");
            }
        } while (true);

        return isCaseSensitive;
    }

    public char getAnalysChar() {
        do {
            System.out.print("Analiz etmek için bir harf girin: ");
            char analysChar = scanner.nextLine().charAt(0);
            if (Character.isLetter(analysChar)) {
                return analysChar;
            } else {
                System.out.println("Lütfen bir harf girin.");
            }
        } while (true);
    }
    
}
