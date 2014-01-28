package nk_Automata.StatesStructure;

import java.util.HashMap;
import java.util.Map;



public class StatesStructure {
	private Map<State, State> statesMap;
	
	public StatesStructure() {
		fillDefault();
	}
	
	private void fillDefault(){
		
		statesMap= new HashMap<State, State>();
		
	
		
	}
		
		
	private State nextState(State state){
		
		return state;
	}
	
}
