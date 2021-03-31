import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int m = pedirEntero("¿Numero inicial de Eopies?");
        int n = pedirEntero("¿Numero inicial de contenedores?");

        Eopie lista_Eopies[] = new Eopie[m];
        Contenedor lista_Contenedores[] = new Contenedor[n];

        rellenar_lista_Eopie(lista_Eopies);
        rellenar_lista_Contenedores(lista_Contenedores);
        mostrarInfo(lista_Eopies, lista_Contenedores);

    }

    public static int pedirEntero(String c) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.println(c);
        numero = teclado.nextInt();
        return numero;
    }

    public static void rellenar_lista_Eopie(Eopie lista[]) {
        Random ran = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Eopie((Math.random() * 51) + 1);
        }
    }

    public static void rellenar_lista_Contenedores(Contenedor lista[]) {

        Random ran = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Contenedor((Math.random() * 51) + 1);
        }
    }
    public static void mostrarInfo(Eopie[] lista_Eopies, Contenedor[] lista_Contenedores) {
        System.out.println("Eopies: ");
        for (int i = 0; i < lista_Eopies.length; i++) {
            System.out.println(lista_Eopies[i]);
        }
        System.out.println("Contenedores: ");
        for (int i = 0; i < lista_Contenedores.length; i++) {
            System.out.println(lista_Contenedores[i]);
        }

    }
}
