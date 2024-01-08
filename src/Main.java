import FactoryExample.Pago;
import FactoryExample.PagoFactory;
import FactoryExample.TipoDePago;
import observer.Ejemplo1Observer;
import observer.Ejemplo2Observer;
import observer.Ejemplo3Observer;
import observer.EjemploObservable;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
       PagoFactory pagoFactory = new PagoFactory();
       Pago pago = pagoFactory.obtenerPago(TipoDePago.BITCOIN);
       pago.crearPago();


//        EjemploObservable observable = new EjemploObservable();
//
//        observable.addObserver(new Ejemplo1Observer());
//        observable.addObserver(new Ejemplo2Observer());
//
//        observable.notifyObservers();
//
//        observable.addObserver(new Ejemplo3Observer());
//        observable.notifyObservers();
    }
}