public class ListaEnlazada {
    private Nodo primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public int tamanio() {
        int contador = 1;
        Nodo nodoActual = this.primero;
        if (nodoActual == null) {
            return 0;
        } else {
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
                contador++;
            }
        }
        return contador;
    }

    public void agregar(int valor) {
        Nodo nodo = new Nodo(valor);
        if (this.primero == null) {
            this.primero = nodo;
        } else {
            Nodo nodoActual = this.primero;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nodo;
        }
    }

    public void sacarUltimo() {
        if (this.tamanio() != 0) {
            if (this.tamanio() == 1) {
                this.primero = null;
            } else {
                Nodo nodoAnterior = null;
                Nodo nodoActual = this.primero;
                while (nodoActual.siguiente != null) {
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.siguiente;
                }
                nodoAnterior.siguiente = null;
            }
        }
    }

    public boolean buscar(int valorBuscado) {
        if (this.primero == null) {
            return false;
        }
        Nodo nodoActual = this.primero;
        while (nodoActual != null) {
            if (nodoActual.valor == valorBuscado) {
                return true;
            }
            nodoActual = nodoActual.siguiente;
        }
        return false;
    }

    public void imprimir() {
        Nodo impresion = this.primero;
        while (impresion != null) {
            System.out.print(impresion.valor + ",");
            impresion = impresion.siguiente;
        }
        System.out.println();  // Para una nueva línea después de la impresión
    }
}
