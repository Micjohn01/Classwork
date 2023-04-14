public class printingWords {
    public static void main(String[] args) {
        String letters = "VENTURES";
        for (int i = 0; i < letters.length(); i += 2) {
            System.out.println(letters.charAt(i) + "" + letters.charAt(i + 1));
        }

    }
}