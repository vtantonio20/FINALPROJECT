import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int gameQuestion = 1;
		Scanner scan = new Scanner(System.in);
		String input;
		
		State newState = new State(null, 0);
		City newCity = new City(null, 0);
		
		
		newState.set("Florida", 1);
		newCity.set("Tallahassee", 1);
		
		Question newQuestion = new Question(gameQuestion, newState, newCity);
		System.out.println(newQuestion.getQuestionNumber());
		
		if(newQuestion.verifyMatch() == true) {
			System.out.println("Match");
		}
		
				
		
		
		//State has a name(string) and an number(int) this number will coresspond to a number that the capitol city holds

		
		
		
	}
	
}
