package main;

import java.util.Objects;

public class Persona {

	private String cedula;

	public Persona(String cedula) {
		super();
		this.cedula = cedula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public int cedulaLenght() {
		return cedula.length();
	}
	
	public boolean isCedulaLengthEven() {
		return cedulaLenght()%2==0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cedula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cedula, other.cedula);
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + "]";
	}
	
	
}
