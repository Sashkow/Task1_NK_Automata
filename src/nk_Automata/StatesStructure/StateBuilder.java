package nk_Automata.StatesStructure;



public class StateBuilder {
	public State buildState(AttractorStateParameters stateParameters){
		return new AttractorState(stateParameters.number,stateParameters.state,stateParameters.attractorId);	
	}
	public State buildState(BasinStateParameters stateParameters){
		return new BasinState(stateParameters.number,stateParameters.state,stateParameters.basinId,stateParameters.firstAttractorState);	
	}
		
	

}
