package examen.plantilla;

public class Cuadrado extends Serie{
    @Override
    protected String calcularTermino(int n) {
        return Integer.toString(n * n);
    }
}
