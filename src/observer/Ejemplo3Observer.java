package observer;

public class Ejemplo3Observer implements Observer{
    @Override
    public void update() {
        System.out.println("Se ha llamado a ejemplo 3");
    }
}
