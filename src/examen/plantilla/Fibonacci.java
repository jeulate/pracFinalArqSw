package examen.plantilla;

public class Fibonacci extends Serie{

    @Override
    public void siguiente() {
        /*Fibonacci*/
        if (lista.size()>=2){
            serie = lista.get(lista.size()-2) + va;
        }else{
            serie = 1;
        }
        va = serie;
    }
}
