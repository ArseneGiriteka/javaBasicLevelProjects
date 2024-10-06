public class Player{
	int number = 0;

	void guess(){
		number = (int)(Math.random()*10);
		System.out.println("I'm guessing "+number);
	}
}