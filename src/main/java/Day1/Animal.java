package Day1;

import java.util.Objects;

public abstract class Animal {

    protected String name;

    public abstract void makeSound();

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + "is sleeping.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Animal animal)) return false;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}