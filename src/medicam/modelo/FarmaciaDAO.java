package medicam.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FarmaciaDAO {
    // Definir los detalles de la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/bdmedicam";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    public boolean agregarProducto(Producto nuevoProducto) {
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            // Query para insertar un nuevo producto en la tabla Producto
            String query = "INSERT INTO Producto (Codigo, Nombre, Precio) VALUES (?, ?, ?)";

            try (PreparedStatement statement = conexion.prepareStatement(query)) {
                statement.setInt(1, nuevoProducto.getCodigo());
                statement.setString(2, nuevoProducto.getNombre());
                statement.setDouble(3, nuevoProducto.getPrecio());
               // statement.setInt(4, nuevoProducto.getTipoProducto().getId());

                // Ejecutar la actualización
                int filasAfectadas = statement.executeUpdate();

                // Devolver true si al menos una fila fue afectada (es decir, si la inserción fue exitosa)
                return filasAfectadas > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Devolver false en caso de error
        }
    }
    public List<Producto> obtenerTodosLosProductos(){
        List<Producto> productos = new ArrayList<>();
        try {
            Connection conexion = DriverManager.getConnection(URL,USUARIO,CONTRASENA);
            PreparedStatement statement = conexion.prepareStatement("SELECT * FROM Producto JOIN TipoProducto ON Producto.TipoProductoID = TipoProducto.ID");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Producto producto = new Producto();
                producto.setCodigo(resultSet.getInt("Codigo"));
                producto.setNombre(resultSet.getString("Nombre"));
                producto.setPrecio(resultSet.getDouble("Precio"));

                TipoProducto tipoProducto = new TipoProducto();
                tipoProducto.setId(resultSet.getInt("ID"));
                tipoProducto.setDescripcion(resultSet.getString("Descripcion"));

                producto.setTipoProducto(tipoProducto);
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
}
