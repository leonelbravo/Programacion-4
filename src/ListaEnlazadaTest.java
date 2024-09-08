import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEnlazadaTest {

    @Test
    void tamanio() {
        ListaEnlazada lista = new ListaEnlazada();
        assertEquals(0, lista.tamanio());

        lista.agregar(1);
        assertEquals(1, lista.tamanio());

        lista.agregar(2);
        assertEquals(2, lista.tamanio());
    }

    @Test
    void agregar() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        assertEquals(3, lista.tamanio());
    }

    @Test
    void sacarUltimo() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        lista.sacarUltimo();
        assertEquals(2, lista.tamanio());
        assertFalse(lista.buscar(3));
    }

    @Test
    void buscar() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        assertTrue(lista.buscar(2));
        assertFalse(lista.buscar(5));
    }

    @Test
    void imprimir() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        lista.imprimir();
    }
    @Test
    public void testSacarUltimoListaVacia() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.sacarUltimo(); // No debería lanzar excepción
        assertEquals(0, lista.tamanio());
    }
}