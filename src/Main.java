public class Main {
    static Caja caja = new Caja(100000.0);
    public static void main(String[] args) {
        Compra compra = new Compra();
        Venta venta = new Venta();
        compra.start();
        venta.start();
    }
}
