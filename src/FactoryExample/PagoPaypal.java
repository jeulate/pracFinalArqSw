package FactoryExample;

public class PagoPaypal implements Pago{
    @Override
    public void crearPago() {
        // logica paypal
        System.out.println("Se aplicara el cobro con metodo paypal");
    }
}
