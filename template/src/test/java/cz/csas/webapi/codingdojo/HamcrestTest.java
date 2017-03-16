package cz.csas.webapi.codingdojo;


import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    public String name = "Michal Bernhard";

    @Test
    public void singleAssertions() {

        collector.checkThat(name, startsWith("Mic"));
        collector.checkThat(name, endsWith("hard"));
        collector.checkThat(name, equalToIgnoringCase("Michal Bernhard"));

    }

    @Test
    public void multipleAssertions() {

        assertThat(name, startsWith("Mic"));
        assertThat(name, endsWith("hard"));
        assertThat(name, equalToIgnoringCase("Michal Bernhard"));

    }
}
