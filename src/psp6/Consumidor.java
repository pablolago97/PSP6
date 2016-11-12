package psp6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Consumidor extends Thread {

    private Caja caja;

    public Consumidor(Caja c) {
        caja = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int retirarAleatorio = (int) (Math.random() * 1000 + 1);
            try {
                caja.retirar(retirarAleatorio);
                System.out.println(retirarAleatorio + " euros retirados");
                //Esperar más para retirar

            } catch (InterruptedException ex) {
                System.out.println("No se pudo ejecutar 'num=retirar'. CONSUMIDOR #ERROR");
            }
            try {
                sleep((long) (Math.random() * 500));
            } catch (InterruptedException ex) {
                System.out.println("No se ha podido llevar acabo el 'sleep()'");
            }

        }
    }

}
