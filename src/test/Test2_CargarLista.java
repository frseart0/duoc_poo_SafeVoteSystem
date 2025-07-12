package test;

import modelo.PrimeList;
import modelo.PrimesThread;

public class Test2_CargarLista {
    public static void main(String[] args) {
        final String archivoLista = "src/colecciones/numeros_primos.csv";
        PrimeList primeList = new PrimeList();
        PrimesThread thread1 = new PrimesThread(primeList);

        primeList.CargarLista(archivoLista);

        System.out.println(primeList);
    }
}
