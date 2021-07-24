package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad,short goles, byte dorsal) {
		super(nombre, edad, "Portero");
		golesRecibidos=goles;
		this.dorsal = dorsal;
	}
	public boolean jugarConLasManos() {
		return true;
	}
	
	public String toString() {
		return "El futbolista" + getNombre() + "tiene" + getEdad() + "y juega de posición" +
			    getPosicion() + "con el dorsal" + dorsal + ". Le han marcado" + golesRecibidos;
	}
	
	public int compareTo(Futbolista f) {
		return this.golesRecibidos - ((Portero)f).golesRecibidos;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
