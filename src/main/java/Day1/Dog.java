package Day1;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("HAM HAM ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
