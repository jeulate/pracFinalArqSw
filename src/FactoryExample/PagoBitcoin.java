package FactoryExample;

public class PagoBitcoin implements Pago{
    @Override
    public void crearPago() {
        System.out.println("Dame tu Billetera BTC para cobrar"
        );
    }
}
