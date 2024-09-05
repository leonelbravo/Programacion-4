public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(1);
        System.out.print("Lista enlazada: ");
        lista.imprimir();
        lista.agregar(2);
        System.out.print("Lista enlazada: ");
        lista.imprimir();
        lista.agregar(3);
        System.out.print("Lista enlazada: ");
        lista.imprimir();
    }
}