package examen.plantilla;

import java.util.ArrayList;
import java.util.List;

public abstract class Serie {
    public String generarSerie(int n){
       StringBuilder result = new StringBuilder();
        for (int i = 1; i<=n; i++){
            result.append(calcularTermino(i));
            if (i<n){
                result.append(" + ");
            }
        }
        return result.toString();
    }
    protected abstract String calcularTermino(int n);
}
