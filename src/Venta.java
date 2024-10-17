import java.util.ArrayList;
import java.util.Random;

public class Venta extends Thread{
    ArrayList<Double> precios = new ArrayList<Double>();
    public void vender (Caja caja, Double precioVenta) {
        caja.setDinero(caja.getDinero() + precioVenta);
        System.out.println("Venta realizada con éxito("+precioVenta+"). Dinero restante: " + caja.getDinero());
    }

    @Override
    public void run() {
        precios.add(100.0);
        precios.add(200.0);
        precios.add(300.0);
        precios.add(400.0);
        precios.add(500.0);
        precios.add(600.0);
        precios.add(700.0);
        precios.add(800.0);
        precios.add(900.0);
        precios.add(1000.0);
        for (int i = 0; i < 10; i++) {
            vender(Main.caja, precios.get(i).doubleValue());
        }
    }
}
