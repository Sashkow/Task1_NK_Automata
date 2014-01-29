package nk_Automata.StatesStructure;

public class AttractorStateParameters extends StateParameters {
	Integer attractorId;
	Integer weight;

	public Integer getAttractorId() {
		return attractorId;
	}

	private void setAttractorId(Integer attractorId) {
		this.attractorId = attractorId;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public AttractorStateParameters(Integer number, State next, Integer attractorId) {
		super(number, next);
		 setAttractorId(attractorId);
		
	}

}
