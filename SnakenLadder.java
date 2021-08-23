
public class SnakenLadder {

	public static void main(String[] args) {
		int stating_position=0;
		int NoWay=0;
		int Ladder=1;
		int Snake=2;
		int current_position=0;
		int outcome=(int) (Math.floor(Math.random()*10)%6);
		int option=(int) (Math.floor(Math.random()*10)%3);
		System.out.println("Initial position of the player is::"+stating_position);
		System.out.println("player got  "+outcome+" while rolling the dice");
		switch(option)
			{
			case 1:current_position+=outcome;
						break;
			case 2:current_position-=outcome;
					break;
					
			default:current_position+=0;
			
			}
		System.out.println("players new position after rolling the dice="+current_position);

	}

}

