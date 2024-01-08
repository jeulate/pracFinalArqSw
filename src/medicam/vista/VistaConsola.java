package medicam.vista;

import medicam.modelo.Producto;
import medicam.modelo.TipoProducto;

import java.util.List;
import java.util.Scanner;

public class VistaConsola {
    private Scanner scanner;
    public VistaConsola(){
        this.scanner = new Scanner(System.in);
    }
    public void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Mostrar Todos los Productos");
        System.out.println("3. Mostrar Productos por Tipo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos para mostrar.");
        } else {
            System.out.println("----- Lista de Productos -----");
            for (Producto producto : productos) {
                System.out.println("Código: " + producto.getCodigo());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Tipo: " + producto.getTipoProducto().getDescripcion());
                System.out.println("--------------------------------");
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    public int leerOpcion() {
        int opcion = -1;

        try {
            opcion = scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        return opcion;
    }
    public String leerCadena() {
        return scanner.nextLine();
    }
    public int leerEntero() {
        int entero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                entero = Integer.parseInt(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
            }
        }

        return entero;
    }
    public double leerDouble() {
        double numero = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                numero = Double.parseDouble(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número decimal válido.");
            }
        }

        return numero;
    }

    public void mostrarTodosLosProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos para mostrar.");
        } else {
            System.out.println("----- Lista de Todos los Productos -----");
            for (Producto producto : productos) {
                mostrarDetallesProducto(producto);
                System.out.println("----------------------------------------");
            }
        }
    }

    private void mostrarDetallesProducto(Producto producto) {
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());

        TipoProducto tipoProducto = producto.getTipoProducto();
        if (tipoProducto != null) {
            System.out.println("Tipo: " + tipoProducto.getDescripcion());
        } else {
            System.out.println("Tipo: No especificado");
        }
    }
}
