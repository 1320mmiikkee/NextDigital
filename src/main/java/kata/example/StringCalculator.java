package kata.example;

public class StringCalculator {

    public int add(String numbers) {

        if (numbers.isEmpty()) {
            return 0;
        }

        String[] values = numbers.split(",");

        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }

        return sum;

    }

}
