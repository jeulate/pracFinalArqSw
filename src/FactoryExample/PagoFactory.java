package FactoryExample;

public class PagoFactory {

    public Pago obtenerPago(TipoDePago tipoDePago) throws NoSuchFieldException{
        return switch (tipoDePago){
            case PAYPAL -> new PagoPaypal();
            case TRANSFERENCIA_BANCARIA -> new PagoTransBanc();
            case TARJETA_DEBITO -> new PagoTarjetaDebito();
            case TARJETA_CREDITO -> new PagoTarjetaCredito();
            case GOOGLE_PAY -> new PagoGooglePay();
            case BITCOIN -> new PagoBitcoin();
            case EFECTIVO -> new PagoEfectivo();
            case APPLE_PAY -> new PagoApplePay();
        };
    }
}
