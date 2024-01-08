package medicam;

import medicam.controlador.FarmaciaController;
import medicam.modelo.FarmaciaDAO;
import medicam.vista.VistaConsola;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de FarmaciaDAO, VistaConsola y FarmaciaController
        FarmaciaDAO dao = new FarmaciaDAO();
        VistaConsola vista = new VistaConsola();
        FarmaciaController controller = new FarmaciaController(dao, vista);

        // Iniciar la aplicación
        controller.iniciarAplicacion();
    }
}
