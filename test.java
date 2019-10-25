import java.io.Serializable;

public class EmpleadoObj implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	private int dpto;
	private double salario;
	
	public EmpleadoObj(int id, String nombre, int dpto, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.dpto = dpto;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDpto() {
		return dpto;
	}

	public double getSalario() {
		return salario;
	}

}
