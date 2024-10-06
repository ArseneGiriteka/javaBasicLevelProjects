public class GuessGame{
	Player pOne;
	Player pTwo;
	Player pThree;

	void startGame(){
		pOne = new Player();
		pTwo = new Player();
		pThree = new Player();

		int guessPOne;
		int guessPTwo;
		int guessPThree;

		boolean pOneIsRight = false;
		boolean pTwoIsRight = false;
		boolean pThreeIsRight = false;

		System.out.println("I m tryna find your next number to geuss ");
		int numberToGuess = (int)(Math.random()*10);

		while(true){
			pOne.guess();
			pTwo.guess();
			pThree.guess();

			guessPOne = pOne.number;
			guessPTwo = pTwo.number;
			guessPThree = pThree.number;

			System.out.println("Player one guessed "+ guessPOne);
			System.out.println("Player two guessed "+ guessPTwo);
			System.out.println("Player three guessed "+ guessPThree);

			if(guessPOne == numberToGuess)
			{
				pOneIsRight = true;
			}
			if(guessPTwo == numberToGuess)
			{
				pTwoIsRight = true;
			}
			if(guessPThree == numberToGuess)
			{
				pThreeIsRight = true;
			}

			if(pOneIsRight || pTwoIsRight || pThreeIsRight){
				System.out.println("Player one "+pOneIsRight);
				System.out.println("Player two "+pTwoIsRight);
				System.out.println("Player three "+pThreeIsRight);
				break;
			}
			else{
				System.out.println("None of you is right okay?");
			}
		}
	}
}