package chapter3;

public class Chapter3Slide29 {

	public static void main(String[] args) {
		
		// Block number: 0				1					2					3
		// [0, 51] -> [0, 12] = Club, [13, 25] = Diamond, [26, 38] = Heart, [39 to 51] = Spade
		// Each block has 13 elements. 
		// Take current element (number) % 13 = remainder = [0, 12]
		// 0 -> Ace
		// 1 -> 2 ... 9 -> 10 | numerical value
		// 10 -> Jack
		// 11 -> Queen
		// 12 -> King

		// [a,b] -> [0, b]
		// Between 0 to 51
		int randomNumber = (int) (Math.random() * 52);
		
		// RandomNumber = 14
		int blockNumber = (int) randomNumber / 13;	// 1.xx -> 1
		int value = (int) randomNumber % 13;	// 14 % 13 = 1
		
		String suit = "";
		String card = "";
		
		// Check what block we are on and map a proper suit value to the suit variable
		switch(blockNumber) {
		case 0:
			suit = "Clubs";
			break;
		case 1:
			suit = "Diamonds";
			break;
		case 2:
			suit = "Hearts";
			break;
		case 3:
			suit = "Spades";
			break;
		default:
			System.out.println("Invalid suit generated.");
			System.exit(0);
		}
		
		// Map face value of the card.
		switch(value) {
		case 0:
			card = "Ace";
			break;
		case 10:
			card = "Jack";
			break;
		case 11:
			card = "Queen";
			break;
		case 12:
			card = "King";
			break;
		default:
			// If value is [1, 9]
			card = card + (value + 1);
			// card += (value + 1)
		}
		
		System.out.println("Value generated is: " + randomNumber);
		System.out.println("Your card is the " + card + " of " + suit);
	}

}
