
public class State {
	private String stateName;
	private int stateNumber;
	
	public State(String stName, int stNum) {
		stateName = stName ;
		stateNumber = stNum;
	}
	
	public State(State CopyState) {
		stateName = CopyState.stateName;
		stateNumber = CopyState.stateNumber;		
	}
	//USED TO SET data
	public void set(String stName, int stNum) {
		stateName = stName ;
		stateNumber = stNum;
	}
	
	public int getStateNum() {
		int stateNum = stateNumber;
		return stateNum;
	}
}
