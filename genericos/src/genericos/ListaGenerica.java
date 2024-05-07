package genericos;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    private List<T> lista;

    public ListaGenerica() {
        lista = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        lista.add(elemento);
    }

    public T obtenerElemento(int indice) {
        return lista.get(indice);
    }

    public int tamaño() {
        return lista.size();
    }
}
