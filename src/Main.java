import modelo.PrimeList;
import modelo.PrimesThread;

public class Main {
    public static void main(String[] args) {
        final String archivoLista = "src/colecciones/numeros_primos.csv";

        PrimeList primeList = new PrimeList();
        PrimesThread thread1 = new PrimesThread(primeList);

        primeList.CargarLista(archivoLista);

        primeList.getPrimeCount();

        thread1.run();

        primeList.getPrimeCount();

        System.out.println(primeList);

    }
}