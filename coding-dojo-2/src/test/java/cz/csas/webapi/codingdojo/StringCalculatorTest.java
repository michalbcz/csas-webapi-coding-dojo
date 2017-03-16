package cz.csas.webapi.codingdojo;

import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    private StringCalculator calc = new StringCalculator();

    private Map<String, Integer> dataSet = new LinkedHashMap<String, Integer>() {{
        put("", 0);
        put("1", 1);
        put("1,2", 3);
        put("1,2,3,4", 10);
        put("1\n2,3", 6);
        put("//;\n1;2", 3);
    }};

    @Test
    public void wrongInput() {
        assertThrows(RuntimeException.class, () -> calc.add("1,\n"));
    }

    @TestFactory
    public Stream add() {
        return dataSet.entrySet().stream()
                .map(entry -> DynamicTest.dynamicTest(getDisplayName(entry), () -> {
                    String inputValue = entry.getKey();
                    Integer expectedValue = entry.getValue();
                    assertThat(calc.add(inputValue)).isEqualTo(expectedValue);
        }));
    }

    private String getDisplayName(Map.Entry<String, Integer> entry) {
        return "'" + StringEscapeUtils.escapeJava(entry.getKey()) + "' == " + entry.getValue();
    }
}
