
public class IncrementDecrement {
	
	public static void main(String[] args) {
		int lives = 5;
		
		lives = lives - 1;
		System.out.println(lives);
		
		//Posfijo
		lives--; //Decremento
		System.out.println(lives);
		
		lives++; //Incremento
		System.out.println(lives);
		
		//Prefijo
		//Gana un regalo por ganar una vida
		int gift = 100 + ++lives;
		System.out.println(gift);
		System.out.println(lives);
	}

}
