package nk_Automata.StatesStructure;

public class AttractorStateParameters extends StateParameters {
	Integer attractorId;

	public AttractorStateParameters(Integer number, State next, Integer attractorId) {
		super(number, next);
		this.attractorId=attractorId;
		
	}

}
