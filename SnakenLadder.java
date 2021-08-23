public class SnakenLadder {

	public static void main(String[] args) {
		int stating_position = 0;
		int current_position = 0;
		System.out.println("Initial position of the player is::" + stating_position);

		while (true) {
			int outcome = (int) (Math.floor(Math.random() * 10) % 6);
			int option = (int) (Math.floor(Math.random() * 10) % 3);

			// option=0 means Noway 1 means Ladder 2 means snake
			switch (option) {
			case 1:
				current_position += outcome;
				break;
			case 2:
				if (current_position - outcome < 0) {
					current_position = 0;
				} else {
					current_position -= outcome;
				}
				break;

			default:
				current_position += 0;

			}
			System.out.println("players new position after rolling the dice=" + current_position);
			if (current_position == 100) {
				break;
			}
		}
	}

}


