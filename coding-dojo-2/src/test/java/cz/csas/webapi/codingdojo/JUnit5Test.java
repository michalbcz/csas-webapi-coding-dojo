package cz.csas.webapi.codingdojo;


import org.junit.jupiter.api.*;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class JUnit5Test {

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
        System.out.println("before EACH test");
    }

    @Test
    void succeedingTest() {
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @DisplayName("showcase of multiple assertions - all of them are evaluated")
    void multipleAsserts() {
        // something like ErrorCollector
        assertAll(
                () -> { fail("fail 1"); },
                () -> { fail("fail 2"); },
                () -> { fail("fail 3"); }
        );
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    @Test
    public void shouldFailOnWindows() {
        assumingThat(File.separatorChar == '\\', () -> {
            fail("this is windows");
        });
    }

    @Test
    public void shouldFailOnLinux() {
        assumingThat(File.separatorChar == '/', () -> {
            fail("this is linux");
        });
    }

}
