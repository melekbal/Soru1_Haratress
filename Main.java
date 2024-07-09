
public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        int maxChar = operations.getMaxChar();
        String text = operations.getValidatedText(maxChar);
        boolean isCaseSensitive = operations.getCaseSensitivity();
        char analysChar = operations.getAnalysisChar();

        operations.result(text, isCaseSensitive, analysChar);

        
    }
}
