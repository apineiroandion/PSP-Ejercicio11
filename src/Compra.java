import java.util.ArrayList;
import java.util.Random;

public class Compra extends Thread{
    ArrayList<Double> precios = new ArrayList<Double>();

    public void comprar (Caja caja, Double precioCompra) {
        if (caja.getDinero() >= precioCompra) {
            caja.setDinero(caja.getDinero() - precioCompra);
            System.out.println("Compra realizada con éxito("+precioCompra+"). Dinero restante: " + caja.getDinero());
        } else {
            System.out.println("No hay suficiente dinero en la caja para realizar la compra.");
        }
    }

    @Override
    public void run() {
        precios.add(100.0);
        precios.add(200.0);
        precios.add(300.0);
        precios.add(400.0);
        precios.add(500.0);
        for (int i = 0; i < 5; i++) {
            comprar(Main.caja, precios.get(i).doubleValue());
        }
    }
}
