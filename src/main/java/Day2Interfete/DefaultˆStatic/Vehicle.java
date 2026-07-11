package Day2Interfete.DefaultˆStatic;

public interface Vehicle {
    void start();

    default void honk() {
        System.out.println("Beep!");
    }

    static Vehicle create() {
        return new Car();
    }
}
