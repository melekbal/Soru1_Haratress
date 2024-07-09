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

    public char getAnalysisChar() {
        do {
            System.out.print("Analiz etmek için bir harf girin: ");
            char analysisChar = scanner.nextLine().charAt(0);
            if (Character.isLetter(analysisChar)) {
                return analysisChar;
            } else {
                System.out.println("Lütfen geçerli bir karakter girin.");
            }
        } while (true);
    }

    public void result(String text, boolean isCaseSensitive, char analysisChar) {
        if (isCaseSensitive == false) {
            text = text.toLowerCase();
            analysisChar = Character.toLowerCase(analysisChar);

            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == analysisChar) {
                    count++;
                }
            }

            System.out.println("Girilen cümlede " + analysisChar + " harfi toplamda " + count + " kez geçmektedir.");
        } else {
            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == analysisChar) {
                    count++;
                }
            }

            System.out.println("Girilen cümlede '" + analysisChar + "' harfi toplamda " + count + " kez geçmektedir.");
        }
    }
}
