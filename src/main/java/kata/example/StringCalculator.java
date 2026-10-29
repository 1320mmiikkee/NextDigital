package kata.example;
import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) {

        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";

        if (numbers.startsWith("//")) {
            int endOfDelimiter = numbers.indexOf("\n");
            delimiter = numbers.substring(2, endOfDelimiter);
            numbers = numbers.substring(endOfDelimiter + 1);
        }

        // String[] values = numbers.split(delimiter);
        String[] values = numbers.split(Pattern.quote(delimiter));

        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }

        return sum;

    }

}
