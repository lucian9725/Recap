package Day1;

public class Cat extends Animal{

    Cat (String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Miau Miau!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
