public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(100000.0);
        Compra compra = new Compra();
        Venta venta = new Venta();
        compra.start();
        venta.start();
    }
}
