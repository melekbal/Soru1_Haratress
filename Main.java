
public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        int maxChar = operations.getMaxChar();
        String text = operations.getValidatedText(maxChar);
        boolean isCaseSensitive = operations.getCaseSensitivity();
        char analysChar = operations.getAnalysChar();

        System.out.println("Girdiğiniz cümle: " + text);
        System.out.println("Büyük/küçük harf duyarlılığı: " + (isCaseSensitive ? "Aktif" : "Pasif"));
        System.out.println("Analiz edilecek harf: " + analysChar);

        
    }
}
