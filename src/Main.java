import modelo.PrimeList;
import modelo.PrimesThread;

public class Main {
    public static void main(String[] args) {
        PrimeList primeList = new PrimeList();
        Thread thread = new Thread(new PrimesThread(primeList));
        thread.start();
    }
}