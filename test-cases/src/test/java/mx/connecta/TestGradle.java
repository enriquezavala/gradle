package mx.connecta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGradle {

    @Test
    public void testGradle() {
        String message = "Hello Gradle";
        assertEquals("Hello Gradle", message);
    }

    @Test
    public void testStudents() {
        String message = "Hello Students";
        assertEquals("Hello Students", message);
    }

    @Test
    public void testTeachers() {
        String message = "Hello Teachers";
        assertEquals("Hello Teachers", message);
    }
}
