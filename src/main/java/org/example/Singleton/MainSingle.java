package org.example.Singleton;

public class MainSingle {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();
        obj2.showMessage();

        System.out.println(obj1 == obj2);  //TRUE - aceeasi instanta
    }
}

/*
Ideea de baza Singleton:

- Singleton rezovla o singura problema, raspunde la intrebarea:

Cum ma asigur ca dintr-o clasa exista exact o singura instanta in toata aplicatia si oricine are nevoie de ea primeste aceeasi instanta?

De ce avem nevoie?

- nu are sens de mai multe ori sa vem conexiuni la o baza de date

- ai nevoie de o singura conexiune la o baza de date, iti creezi propria conexiune;

-un singur logger -  daca vrei ca toate datele de log sa treaca prin acelasi obiect, atunci folosesti Singleton

- o singura configurare globala
 */
