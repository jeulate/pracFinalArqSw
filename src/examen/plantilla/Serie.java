package examen.plantilla;

import java.util.ArrayList;

public abstract class Serie {
ArrayList<Integer> lista = new ArrayList<>();
int serie;
int va;

public abstract void siguiente();

    public ArrayList<Integer> generarSerie(int n) {
        lista.clear();
        serie=0;
        va = serie;
        int c=1;
        while (c<=n){
            siguiente();
            lista.add(va);
            c++;
        }
        return lista;
    }
}
