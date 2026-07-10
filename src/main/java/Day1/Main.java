package Day1;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("REX");
        Animal cat = new Cat("Kitty");

        dog.makeSound();
        cat.makeSound();

        dog.sleep();
        cat.sleep();

        System.out.println(dog);
        System.out.println(cat);

        Dog dog2 = new Dog("REX");

        System.out.println(dog.equals(dog2));
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());
    }
}
