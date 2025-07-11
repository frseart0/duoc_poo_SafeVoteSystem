import modelo.PrimeList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PrimeList lista = new PrimeList();
        lista.add(7);
        lista.add(11);
        System.out.println(lista);
        int numero = (int) (Math.random()*1000);
        System.out.println(numero);
        lista.add(numero);
        System.out.println(lista);
    }
}