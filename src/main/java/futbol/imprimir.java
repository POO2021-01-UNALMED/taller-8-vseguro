package futbol;

public class imprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Futbolista f = new Futbolista("Alejo", 20, "Delantero");
		/*Futbolista f = new Futbolista();
		System.out.println(f.getEdad());
		System.out.println(f.getNombre());
		System.out.println(f.getPosicion());
		System.out.println(f);
		Futbolista  f2 = new Futbolista();
		System.out.println(f.equals(f2));*/
		
		//Jugador f = new Jugador("Valeria", 21, "defensa", (short) 4, (byte) 8);
		/*Jugador f = new Jugador();
		System.out.println(f.getEdad());
		System.out.println(f.getNombre());
		System.out.println(f.getPosicion());
		System.out.println(f.golesMarcados);
		System.out.println(f.dorsal);
		Jugador f1 = new Jugador();
		Jugador f2 = new Jugador("Valeria", 21, "defensa", (short) 4, (byte) 8);
        System.out.println(f1.compareTo(f2));
        System.out.println(f1.jugarConLasManos());*/
		Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
		Portero f1 = new Portero("Antonio", 23, (short) 6, (byte) 1);
		Portero f2 = new Portero("Santiago", 23, (short) 15, (byte) 8);
		System.out.println(f.jugarConLasManos());
        
	}
}