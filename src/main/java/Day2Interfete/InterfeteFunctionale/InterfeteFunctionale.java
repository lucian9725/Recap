package Day2Interfete.InterfeteFunctionale;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfeteFunctionale {
    public static void main(String[] args) {
        Runnable task  = () -> System.out.println("Task ruleaza");
        Supplier<String> greetings = () -> "Salut, lume!";
        Consumer<String> print = s -> System.out.println(s.toUpperCase());
        Function<String, Integer> length = s -> s.length();
        Predicate<Integer> isEven = n -> n % 2 == 0;

        task.run();
        print.accept(greetings.get());
        System.out.println(length.apply("JAVA"));
        System.out.println(isEven.test(7));
    }
}
