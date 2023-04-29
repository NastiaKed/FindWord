import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public List <String> getWords(String input) {
        List <String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]\\d[a-zA-Z]*");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Main main = new Main();
        System.out.println(main.getWords(input));
    }
}