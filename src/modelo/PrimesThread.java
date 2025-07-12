package modelo;

import java.util.concurrent.ThreadLocalRandom;

public class PrimesThread implements Runnable {
    private final PrimeList primeList;

    public PrimesThread(PrimeList primeList) {
        this.primeList = primeList;
    }

    @Override
    public void run() {
        int numero = ThreadLocalRandom.current().nextInt(100);
        try {
            primeList.add(numero);
            System.out.println("primo añadido: " + numero);
            primeList.guardarNumero(Globals.archivoListaPrimos, numero);
        } catch (IllegalArgumentException e) {
            System.out.println("numero rechazado: " + numero);
        }
    }
}