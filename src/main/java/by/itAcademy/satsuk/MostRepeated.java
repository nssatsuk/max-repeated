package by.itAcademy.satsuk;

public class MostRepeated {
    private String text;

    public String getText() {
        return text;
    }

    public MostRepeated(String text) {
        this.text = text;
    }

    public char mostRepeatedChar() {
        char mostRepeatedChar = text.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostRepeatedChar = currentChar;
            }
        }
        return mostRepeatedChar;
    }

    public int getMaxCount() {
        int maxCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}