package modelo;
import modelo.PrimeList;
import java.util.Random;

public class PrimesThread implements Runnable{

    @Override
    public void run() {
        int numero = (int) (Math.random()*100);
        
    }
}
