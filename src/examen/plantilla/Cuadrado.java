package examen.plantilla;

public class Cuadrado extends Serie{
    @Override
    public void siguiente() {
        serie = serie + 1;
        va = serie * serie;
    }
}
