package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Test działania");

        Animal dog = new Animal("dog");
//        Animal cat = new Animal(species);
//        Animal frog = new Animal(species);

//        dog.species = "dog";
        dog.name = "Haiko";
//        dog.weight = 22.0;

        System.out.println(dog.name);
        System.out.println(dog.species);

        Phone oneplus = new Phone();
        oneplus.producer = "1+";
        oneplus.model = "firstone";
        oneplus.screenSize = 6.0;
        System.out.println(); // skrut sout + tab

//        System.out.println(dog.weight);
        dog.feed(0.3);  // w ststemie binarnym ni ejestesmy w stanie zapisac ja dokladnie
        dog.feed(0.3);
        dog.feed(0.3);
//        System.out.println(dog.weight);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // do pieniedzy sa inne obiekty ktore sa dokladniejsze ale wolniejsze

        BigInteger bi = new BigInteger("67657846783457813573466534");
        BigDecimal bd = new BigDecimal("243.75874857475485485487510975043");

        double d = 3.0;  // to nie jest obiekt tylko lysa wartosc typ prosty  To jest szybsze od Double !!!
        Double dd = 3.0; // to jest obiekt klasy Double
        BigDecimal ddd = new BigDecimal("0.3"); // do duzej dokladnosci jak liczenie kasy

        System.out.println(ddd);

        Human me = new Human();
        me.firstName = "Bartek";
        me.lastName = "Janiszewski";
        me.pet = dog;  // w pole mozemy wpisac jakis obiekt

        Double a = dog.getWeight();
        a++;
        System.out.println(dog.getWeight());
        System.out.println(a);

        /*me = new Human();  // jak tworzymy to poprzedni obietk z bartek - nie ma do nie go dostepu
        me = null; // w tym wypadku tez garbyc colektory czysci poprzedni obiekt*/

        System.out.println("------------------");

        System.out.println("Waga psa " + dog.getWeight());
        dog.feed(2.0);
        dog.takeForAWalk(15);
        System.out.println("Waga psa " + dog.getWeight());
        dog.takeForAWalk(25);
        dog.feed(1.0);

        while (dog.isAlive) {
            dog.takeForAWalk(10);
        }

        System.out.println();
        System.out.println("-----------------");
        System.out.println();

        Car chrysler = new Car("Chrysler", "Tow & Country", 2008);
        chrysler.capacity = 4.0;
        chrysler.engine = "Petrol";

        System.out.println(chrysler.mark + " " + chrysler.model + " " + chrysler.year + ", " + chrysler.engine + " " + chrysler.capacity);
    }
}
