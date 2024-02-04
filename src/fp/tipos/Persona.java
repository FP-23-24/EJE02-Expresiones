package fp.tipos;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Persona {
    private String nombre;
    private Integer edad;
    private Boolean tieneLicencia;
    private Set<String> hobbies;
    private Set<String> paisesVisitados;
    private List<String> librosLeidos;

    // Constructor
    public Persona(String nombre, Integer edad, Boolean tieneLicencia,
                   Set<String> hobbies, Set<String> paisesVisitados, List<String> librosLeidos) {
        this.nombre = nombre;
        this.edad = edad;
        this.tieneLicencia = tieneLicencia;
        this.hobbies = hobbies;
        this.paisesVisitados = paisesVisitados;
        this.librosLeidos = librosLeidos;
    }

    public String getNombre() {
        return nombre;
    }


    public Integer getEdad() {
        return edad;
    }


    public Boolean tieneLicencia() {
        return tieneLicencia;
    }


    public Set<String> getHobbies() {
        return hobbies;
    }


    public Set<String> getPaisesVisitados() {
        return paisesVisitados;
    }


    public List<String> getLibrosLeidos() {
        return librosLeidos;
    }

	@Override
	public int hashCode() {
		return Objects.hash(edad, hobbies, librosLeidos, nombre, paisesVisitados, tieneLicencia);
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
		return Objects.equals(edad, other.edad) && Objects.equals(hobbies, other.hobbies)
				&& Objects.equals(librosLeidos, other.librosLeidos) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(paisesVisitados, other.paisesVisitados)
				&& Objects.equals(tieneLicencia, other.tieneLicencia);
	}

	@Override
	public String toString() {
		return "Persona [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", tieneLicencia()="
				+ tieneLicencia() + ", getHobbies()=" + getHobbies() + ", getPaisesVisitados()=" + getPaisesVisitados()
				+ ", getLibrosLeidos()=" + getLibrosLeidos() + ", hashCode()=" + hashCode() + "]";
	}

    
    
}
