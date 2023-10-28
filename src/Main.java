import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        var scanner = new Scanner(System.in);

        System.out.print("Enter your code: ");
        var code = scanner.nextLine().split(" ");

        for (String s : code) {
            System.out.print(translateCode(s));
        }
    }

    public static String translateCode(String code) {
        var mapCode = new HashMap<String, String>();

        mapCode.put("2", "A");
        mapCode.put("22", "B");
        mapCode.put("222", "C");

        mapCode.put("3", "D");
        mapCode.put("33", "E");
        mapCode.put("333", "F");

        mapCode.put("4", "G");
        mapCode.put("44", "H");
        mapCode.put("444", "I");

        mapCode.put("5", "J");
        mapCode.put("55", "K");
        mapCode.put("555", "L");

        mapCode.put("6", "M");
        mapCode.put("66", "N");
        mapCode.put("666", "O");

        mapCode.put("7", "P");
        mapCode.put("77", "Q");
        mapCode.put("777", "R");
        mapCode.put("7777", "S");

        mapCode.put("8", "T");
        mapCode.put("88", "U");
        mapCode.put("888", "V");

        mapCode.put("9", "W");
        mapCode.put("99", "X");
        mapCode.put("999", "Y");
        mapCode.put("9999", "Z");

        mapCode.put("0", " ");

        return Optional.ofNullable(mapCode.get(code)).orElse("");
    }
}