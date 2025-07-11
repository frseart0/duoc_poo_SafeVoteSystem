package test;

import modelo.PrimeList;

public class Test1_PrimeList {
    public static void main(String[] args) {
        PrimeList primeList = new PrimeList();
        primeList.add(2);
        primeList.add(3);
        primeList.add(5);
        System.out.println(primeList);
        primeList.remove(1); // <- indice
        System.out.println(primeList);
        primeList.add(10); // <- IllegalArgumentException
    }
}