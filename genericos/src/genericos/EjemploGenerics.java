package genericos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploGenerics {
    public static void main(String[] args) {
    	ListaGenerica genericos = new ListaGenerica ();
        // Crear una lista de enteros
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        // Crear una lista de cadenas
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("!");
        genericos.agregarElemento("HOla");
        genericos.agregarElemento(1);
        
        for (int i = 0; i < genericos.tamaño(); i++) {
        	System.out.println(genericos.obtenerElemento(i));
		}
        // Imprimir el contenido de las listas
        imprimirLista(listaEnteros);
        imprimirLista(listaCadenas);
    }

    // Método genérico para imprimir cualquier lista
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
