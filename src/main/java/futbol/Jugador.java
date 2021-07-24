package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, final String posicion, short goles, byte dorsal) {
		super(nombre, edad, posicion);
		golesMarcados = goles;
		this.dorsal = dorsal;
	}
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	@Override
	public int compareTo(Futbolista f) {
	    /*if (this.compareTo(f)==0) {
	    	return this.getEdad();
	    }
	    else if(this.compareTo(f)<0){
	    	return f.getEdad()- this.getEdad();
	    }*/
	    return this.getEdad()-f.getEdad();
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return "El futbolista" + getNombre() + "tiene" + getEdad() + "y juega de posición" +
	    getPosicion() + "con el dorsal" + dorsal + ". Ha marcado" + golesMarcados;
	}

}
