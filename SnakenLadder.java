public class SnakenLadder {

	public static void main(String[] args) {
		int count1 = 0;
		int current_pos1 = 0;
		int count2 = 0;
		int current_pos2 = 0;
		int outcome1, option1, outcome2, option2;
		while (true) {
			if (current_pos1 == 100 || current_pos2 == 100) {

				break;
			}

			outcome1 = (int) (Math.floor(Math.random() * 10) % 6);
			option1 = (int) (Math.floor(Math.random() * 10) % 3);
			count1 += 1;
			switch (option1) {
			case 1:
				if (current_pos1 + outcome1 > 100) {
					System.out.println("Current position player1 after " + count1 + " die roll is " + current_pos1);
					current_pos1 = current_pos1 + 0;
					break;
				} else {
					current_pos1 += outcome1;
					System.out.println("Current position player1 after " + count1 + " die roll is " + current_pos1);
					continue;
				}

			case 2:
				if (current_pos1 - outcome1 < 0) {
					current_pos1 = 0;
				} else {
					current_pos1 -= outcome1;
				}

				break;

			default:
				current_pos1 += 0;

			}
			System.out.println("Current position player1 after " + count1 + " die roll is " + current_pos1);
			if (current_pos1 == 100) {

				break;
			}

			while (true) {
				if (current_pos2 == 100) {
					break;
				}
				outcome2 = (int) (Math.floor(Math.random() * 10) % 6);
				option2 = (int) (Math.floor(Math.random() * 10) % 3);
				count2 += 1;

				switch (option2) {
				case 1:
					if (current_pos2 + outcome2 > 100) {
						current_pos2 = current_pos2 + 0;
						System.out.println("Current position player2 after " + count2 + " die roll is " + current_pos2);
						break;
					} else {
						current_pos2 += outcome2;
						System.out.println("Current position player2 after " + count2 + " die roll is " + current_pos2);
						continue;
					}

				case 2:
					if (current_pos2 - outcome2 < 0) {
						current_pos2 = 0;
					} else {
						current_pos2 -= outcome2;
					}

					break;

				default:
					current_pos2 += 0;

				}
				System.out.println("Current position player2 after " + count2 + " die roll is " + current_pos2);
				if (current_pos2 == 100) {
					break;
				}

				else {
					break;
				}

			}
		}
		if (current_pos1 == 100) {
			System.out.println("player 1 is winner");
		} 
		else if (current_pos2 == 100) {
			System.out.println("player 2 is winner");

		}

	}

}
