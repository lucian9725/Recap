package org.example.Incapsulare;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("parola");

        System.out.println(user.toString());

    }
}
