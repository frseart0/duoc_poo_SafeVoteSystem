package modelo;

import java.util.ArrayList;
import java.io.*;

public class PrimeList extends ArrayList<Integer> {

    public static boolean isPrime(int numero) {
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
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public synchronized boolean add(Integer numero) {
        if (!isPrime(numero)) {
            throw new IllegalArgumentException("numero invalido: no es primo");
        }
        return super.add(numero);
    }

    @Override
    public synchronized boolean remove(Object o) {
        if (!isPrime((Integer) o)) {
            return super.remove(o);
        }
        return true;
    }

    public synchronized void getPrimeCount() {
        System.out.println("cantidad de primos: " + this.size());
    }

    public synchronized void CargarLista(String archivoLista) {
        clear();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoLista))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea.trim());
                    this.add(numero);
                } catch (IllegalArgumentException _) {
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Lista Cargada");
    }

    public synchronized void guardarNumero(String ArchivoLista,int numero) {
        if (!isPrime(numero)) {
            System.out.println("Número no es primo, no se guardará.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ArchivoLista, true))) {
            bw.write(numero + "\n");
            System.out.println("Número guardado.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
