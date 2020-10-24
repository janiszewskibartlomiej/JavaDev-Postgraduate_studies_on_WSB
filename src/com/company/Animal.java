package com.company;

import java.io.File;

public class Animal {

    static final Double MIN_WEIGHT = 0.1; //jedyne pole do ktorego mozemy odwolac sie
    public final String species;
    public boolean isAlive = true;
    String name;
    File pic;
    private Double weight = 10.0;

    public Animal(String species2) {
        this.species = species2;
    }

    public void feed(Double foodWeight) {  //void czyli nic nie zwaraca  - zwraca pusteke
        if (this.isAlive) {
            weight += foodWeight;
            System.out.println("Dziekuje za jedzenie, aktualna waga " + weight);

        } else {
            isAlive = false;
            System.out.println(this.name + "Nie żyje, wiec nei da rady go nakarmić");
        }
    }

    public void takeForAWalk(int time) {

        if (this.isAlive) {
            double losingWeight = 0.1 * time;
            weight -= losingWeight;
            System.out.println("Wyprowadzam psa na spacer, jego waga aktualna  " + weight);
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
        } else {
            System.out.println(this.name + "Nie żyje, wiec nie mozna go wyprowadzic na spacer");
        }
    }

    Double getWeight() {
        return weight;
    }
}

/*
 * dobrze jest zrobic szkielet
 *
 * void feed(Double foodWeight) {
 *   if(this.weight <= 0) {
 *   // nie zyje
 * } else {
 *   // zyje
 * }
 *
 * }
 * */