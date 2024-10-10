import java.util.Random;

public class Venta extends Thread{
    public void vender (Caja caja, Double precioVenta) {
        caja.setDinero(caja.getDinero() + precioVenta);
        System.out.println("Venta realizada con éxito. Dinero restante: " + caja.getDinero());
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            vender(new Caja(100000.0), new Random().nextDouble() * 1000);
        }
    }
}
