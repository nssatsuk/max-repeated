package by.itAcademy.satsuk;

public class MostRepeatedDemo {
    public static void main(String[] args) {
        MostRepeated mostRepeated = new MostRepeated("Loremipsumdolorsitamet, consectetuer adipiscing elit.");
        char result = mostRepeated.mostRepeatedChar();
        int count = mostRepeated.getMaxCount();

        System.out.println("Самый частый символ: " + result);
        System.out.println("Кол-во повторений: " + count);
    }
}
