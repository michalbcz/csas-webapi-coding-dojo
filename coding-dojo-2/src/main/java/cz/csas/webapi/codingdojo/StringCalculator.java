package cz.csas.webapi.codingdojo;

import java.util.Arrays;

public class StringCalculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        String customDelimiter = composeDelimiterRegex(input);
        String inputWithoutDelimiter = input.replaceFirst("//.\n", "");
        return Arrays.stream(inputWithoutDelimiter.split(customDelimiter, -1))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private String composeDelimiterRegex(String input) {
        String delimiterRegex = "[,\n";

        if (input.startsWith("//")) {
            return delimiterRegex + input.substring(2,3) + "]";
        } else {
            return delimiterRegex + "]";
        }
    }
}
