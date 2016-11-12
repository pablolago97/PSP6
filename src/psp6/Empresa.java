package psp6;

/**
 *
 * @author Pablo
 */
public class Empresa {

    public static void main(String[] args) {
        Caja c = new Caja();
        Productor p1 = new Productor(c);
        Consumidor c1 = new Consumidor(c);
        p1.start();
        c1.start();
    }

}
