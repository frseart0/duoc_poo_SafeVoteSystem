import modelo.GlobalVars;
import modelo.PrimeList;
import modelo.PrimesThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrimeList primeList = new PrimeList();
        primeList.CargarLista(GlobalVars.archivoListaPrimos);
        primeList.getPrimeCount();

        PrimesThread primesthread1 = new PrimesThread(primeList);

        Thread thread1 = new Thread(primesthread1);

        thread1.start();
        thread1.join();

    }
}