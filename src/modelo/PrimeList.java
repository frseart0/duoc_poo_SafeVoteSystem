package modelo;
import java.util.ArrayList;

public class PrimeList extends ArrayList<Integer>{

    public boolean isPrime(int numero){
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean add(Integer numero) {
        if (!isPrime(numero)) {
            throw new IllegalArgumentException("numero invalido");
        }
        return super.add(numero);
    }

}
