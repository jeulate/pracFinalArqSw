package examen.plantilla;

public class SerieSumaCuadrados extends Serie{
    @Override
    protected String calcularTermino(int n) {
        int suma = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i<=n; i++){
            suma += i * 1;
            result.append(i * 1);
            if (i < n){
                result.append(" + ");
            }
        }
        return result.toString();
    }
}
