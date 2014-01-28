package nk_Automata.StatesStructure;

public class BasinStateParameters extends StateParameters {
	
	Integer basinId;
	AttractorState firstAttractorState;

	public BasinStateParameters(Integer number, State state, Integer basinId,AttractorState s1) {
		super(number, state);
		this.basinId=basinId;
		this.firstAttractorState=s1;
	}
	

}
