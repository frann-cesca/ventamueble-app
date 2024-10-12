package clases;

/**
 * Clase para definir el Cliente y sus atributos;
 */
public class Cliente {
	private int codigoCliente;
	private String nombreCliente;
	private String apellidoCliente
  private String direccionCliente
	private String telefonoCliente
	private String dniCliente;

	/**
	 * Constructor de la clase Cliente.
	 * @param codigoCliente
	 * @param nombreCliente
	 * @param apellidoCliente
	 * @param direccionCliente
	 * @param telefonoCliente
	 * @param dniCliente
	 */
	public Cliente(int codigoCliente, String nombreCliente, String apellidoCliente, String direccionCliente,
			String telefonoCliente, String dniCliente) {
		super();
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.direccionCliente = direccionCliente;
		this.telefonoCliente = telefonoCliente;
		this.dniCliente = dniCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

}
