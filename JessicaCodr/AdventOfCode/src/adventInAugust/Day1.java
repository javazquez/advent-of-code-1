package adventInAugust;

public class Day1 {
	
	public static void main(String[] args){
		String input = args[0];
		char[] directions = input.toCharArray();
		int floor = 0;
		boolean enteredBasement = false;
		for(int directionNum = 0; directionNum < directions.length; directionNum++){
			char direction = directions[directionNum];
			if(direction == '('){
				floor++;
			} else {
				floor--;
			}
			if(!enteredBasement && floor < 0){
				System.out.println("First move into basement: " + directionNum);
				enteredBasement = true;
			}
		}
		System.out.println("Final floor:  " + floor);
	}

}
