package futbol;

public class Futbolista implements Comparable {
	private String nombre;
	private int edad;
	final private String posicion;

	public Futbolista(String nombre, int edad,final String posicion){
		this.nombre=nombre;
		this.edad=  edad;
		this.posicion=posicion;
		}
	
	public Futbolista(){
		this("Maradona", 30, "delantero");
	}
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
	}
	
	public boolean equals(Futbolista f) {////////////////REVISAR
		if (this.compareTo(f)==0) {
			return true;
		}
		return false;
	}
	
	public boolean jugarConLasManos() {
		if (this instanceof Portero) {
			return true;
		}
		return false;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public String getPosicion() {
		return posicion;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
