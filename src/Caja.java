import java.util.concurrent.atomic.AtomicReference;

public class Caja {
    private AtomicReference<Double> dinero;

    public Caja(Double dinero) {
        this.dinero = new AtomicReference<>(dinero);
    }


    public Double getDinero() {
        return dinero.get();
    }

    public void setDinero(Double dinero) {
        this.dinero.set(dinero);
    }
}
