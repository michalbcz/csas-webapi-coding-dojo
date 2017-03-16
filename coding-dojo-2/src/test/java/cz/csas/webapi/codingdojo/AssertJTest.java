package cz.csas.webapi.codingdojo;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    @DisplayName("fail in first assert error")
    public void assertjFailOnFirst() {

        String name = "Michal Bernhard";
        assertThat(name).as("checking properties of name %s", name)
                .startsWith("Mic")
                .endsWith("hard")
                .isEqualToIgnoringCase("Michal Bernhard");

    }

    @Test
    @DisplayName("collect all failures")
    public void assertjMultipleAssert() {

        SoftAssertions softly = new SoftAssertions();

        String name = "Michal Bernhard";
        softly.assertThat(name)
                .startsWith("Mic")
                .endsWith("hard")
                .isEqualToIgnoringCase("Michal Bernhard");

        softly.assertAll();

    }


}
