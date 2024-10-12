package clases;

public class Venta {
	//VARIABLES
	private int codigoVenta, codigoCliente, codigoProducto, cantidadProducto;
	private double precioVenta;
	private String fechaVenta;
	
	//CONSTRUCTOR
	public Venta(int codigoVenta, int codigoCliente, int codigoProducto, int cantidadProducto, double precioVenta,
			String fechaVenta) {
		super();
		this.codigoVenta = codigoVenta;
		this.codigoCliente = codigoCliente;
		this.codigoProducto = codigoProducto;
		this.cantidadProducto = cantidadProducto;
		this.precioVenta = precioVenta;
		this.fechaVenta = fechaVenta;
	}

	//GET AND SET

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	

	
	
}
