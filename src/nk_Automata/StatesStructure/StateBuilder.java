package nk_Automata.StatesStructure;



public class StateBuilder {
	public State buildState(StateParameters parameters){
		return new State(parameters);
	}
	public State buildState(AttractorStateParameters parameters){
		return new AttractorState(parameters);	
	}
	public State buildState(BasinStateParameters parameters){
		return new BasinState(parameters);	
	}
	
	

}
