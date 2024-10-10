import java.util.Random;

public class Compra extends Thread{
    public void comprar (Caja caja, Double precioCompra) {
        if (caja.getDinero() >= precioCompra) {
            caja.setDinero(caja.getDinero() - precioCompra);
            System.out.println("Compra realizada con éxito. Dinero restante: " + caja.getDinero());
        } else {
            System.out.println("No hay suficiente dinero en la caja para realizar la compra.");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            comprar(new Caja(100000.0), new Random().nextDouble() * 1000);
        }
    }
}
