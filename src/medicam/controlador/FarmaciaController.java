package medicam.controlador;

import medicam.modelo.FarmaciaDAO;
import medicam.modelo.Producto;
import medicam.vista.VistaConsola;

import java.util.List;

public class FarmaciaController {
    private FarmaciaDAO dao;
    private VistaConsola vista;
    public FarmaciaController(FarmaciaDAO dao, VistaConsola vista){
        this.dao = dao;
        this.vista = vista;
    }
    public void iniciarAplicacion(){
        vista.mostrarMenu();
        int opcion = vista.leerOpcion();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarTodosLosProductos();
                    break;
                case 3:
                    mostrarProductosPorTipo();
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }

            vista.mostrarMenu();
            opcion = vista.leerOpcion();
        }
    }
    private void agregarProducto() {
        // Lógica para agregar un producto
        // Puedes utilizar la vista para obtener la información del producto y luego llamar al DAO para agregarlo a la base de datos

        vista.mostrarMensaje("Ingrese los detalles del nuevo producto:");

        // Leer información del nuevo producto desde la vista
        vista.mostrarMensaje("Código del producto:");
        int codigo = vista.leerEntero();

        vista.mostrarMensaje("Nombre del producto:");
        String nombre = vista.leerCadena();

        vista.mostrarMensaje("Precio del producto:");
        double precio = vista.leerDouble();

        // Aquí podrías agregar más lógica para obtener el tipo de producto, si es necesario

        // Crear un nuevo objeto Producto con la información proporcionada
        Producto nuevoProducto = new Producto();
        nuevoProducto.setCodigo(codigo);
        nuevoProducto.setNombre(nombre);
        nuevoProducto.setPrecio(precio);

        // Agregar el producto a la base de datos utilizando el DAO
        boolean exito = dao.agregarProducto(nuevoProducto);

        if (exito) {
            vista.mostrarMensaje("Producto agregado con éxito.");
        } else {
            vista.mostrarMensaje("Error al agregar el producto. Inténtelo de nuevo.");
        }
    }

    private void mostrarTodosLosProductos() {
        List<Producto> productos = dao.obtenerTodosLosProductos();
        vista.mostrarProductos(productos);
    }

    private void mostrarProductosPorTipo() {
        // Lógica para mostrar productos por tipo
        // Puedes utilizar la vista para obtener el tipo de producto y luego llamar al DAO para obtener los productos por ese tipo
    }
}
