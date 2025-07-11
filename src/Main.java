import modelo.PrimeList;
import modelo.PrimesThread;

public class Main {
    public static void main(String[] args) {
        final String archivoLista = "src/colecciones/numeros_primos.csv";

        PrimeList primeList = new PrimeList();
        primeList.CargarLista(archivoLista);
        System.out.println(primeList);

    }
}