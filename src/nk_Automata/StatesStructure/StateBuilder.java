package nk_Automata.StatesStructure;



public class StateBuilder {
	public State buildState(AttractorStateParameters parameters){
		return new AttractorState(parameters);	
	}
	public State buildState(BasinStateParameters parameters){
		return new BasinState(parameters);	
	}
	
	

}
