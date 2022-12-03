package bedu;

public class JuegoBolos {
	public static void main(String[] args) {
		BowlingGame juegobolos = new BowlingGame();
		juegobolos.roll(1);
		System.out.println(juegobolos.score());
	}
}
