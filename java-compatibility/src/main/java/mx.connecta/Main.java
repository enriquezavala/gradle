package mx.connecta;

public class Main {
    public static void main(String[] args) {
        var message = "Hello Gradle"; // fails if we set sourceCompatibility to 8
        System.out.println(message);
    }
}