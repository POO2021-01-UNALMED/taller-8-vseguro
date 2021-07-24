package futbol;

public class imprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Futbolista f = new Futbolista("Alejo", 20, "Delantero");
		Jugador f1 = new Jugador();
		Jugador f2 = new Jugador("Valeria", 21, "defensa", (short) 4, (byte) 8);
		System.out.println(f1.compareTo(f2));

}
}