
public class Question {
	private int questionNumber;
	private State state;
	private City city;
	/*
	 * 
	 */
	public Question(int questionNum, State stateClass, City cityClass) {

		questionNumber = questionNum;
		state = stateClass;
		city = cityClass;
	}
	
	public int getQuestionNumber() {
		return questionNumber;
	}
	
	public State getState() {
		return new State(state);
	}
	
	public City getCity() {
		return new City(city);
	}
	
	public boolean verifyMatch() {
			if(city.getCityNum() == state.getStateNum()) {
				return true;
			}else {
				return false;
			}
		
	}
	
	

}
