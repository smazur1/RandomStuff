
import java.util.Random;

public class MonopolyDice {
	public static void main(String[] args) {
		int die1, die2, counter;
		Random rnd = new Random();

		die1 = 1 + rnd.nextInt(6);
		die2 = 1 + rnd.nextInt(6);
		counter = 1;

		if (die1 != die2)
		{
			System.out.println("User rolls " + die1 + " & " + die2);
			System.out.println("Move " + (die1 + die2) + " Spaces and stop");
		}
		else
			while (die1 == die2)
			{

				System.out.println("User rolls " + die1 + " & " + die2);
				System.out.println("DOUBLES!");
				System.out.println("Move " + (die1 + die2) + " Spaces and roll again getting...");	

				die1 = 1 + rnd.nextInt(6);
				die2 = 1 + rnd.nextInt(6);			
				counter ++;	

				if (die1 != die2)
				{
					System.out.println("User rolls " + die1 + " & " + die2);
					System.out.println("Move " + (die1 + die2) + " Spaces and stop");
				}
				else if (counter == 3)
				{
					System.out.println("User rolls " + die1 + " & " + die2);
					System.out.println("Doubles!");
					System.out.println("GO TO JAIL");
					break;
				}
			}

	}
}
