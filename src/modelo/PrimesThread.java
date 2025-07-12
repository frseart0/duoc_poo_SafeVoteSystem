package modelo;

import java.util.concurrent.ThreadLocalRandom;

public class PrimesThread implements Runnable {
    private final PrimeList primeList;

    public PrimesThread(PrimeList primeList) {
        this.primeList = primeList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (primeList) {
                System.out.print(Thread.currentThread().getName() + " "); //para ver que thread es
                int numero = ThreadLocalRandom.current().nextInt(100);
                try {
                    primeList.add(numero);
                    System.out.println("primo añadido: " + numero);
                    primeList.guardarNumero(GlobalVars.archivoListaPrimos, numero);
                } catch (IllegalArgumentException e) {
                    System.out.println("numero rechazado: " + numero);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException _) {

            }
        }
    }
}