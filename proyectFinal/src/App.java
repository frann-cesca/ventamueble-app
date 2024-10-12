import clases.ArchivoClientes;
import clases.Cliente;

import java.util.ArrayList;

public class App {
  public static void main(String args[]) {
    ArchivoClientes archivoClientes = new ArchivoClientes();
    String rutaArchivoCliente = "D:\\development\\java\\ventamueble-app\\proyectFinal\\src\\resources\\clientes.txt";
    ArrayList<Cliente> clientes = archivoClientes.cargarClientes(rutaArchivoCliente);
    archivoClientes.cargarClientes(rutaArchivoCliente).forEach(System.out::println);
    Cliente clienteMishell = new Cliente(
      1004,
      "Mishell",
      "Alvino",
      "Su casa",
      "999900123",
      "75451125"
    );
    archivoClientes.grabarCliente(clienteMishell, rutaArchivoCliente);
    archivoClientes.cargarClientes(rutaArchivoCliente).forEach(System.out::println);
  }
}
