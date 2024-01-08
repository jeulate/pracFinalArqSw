package examen.plantilla;

public class Seriedos extends Serie{

    @Override
    protected String calcularTermino(int n) {
        return Integer.toString((int) Math.pow(10,n-1));
    }
}
