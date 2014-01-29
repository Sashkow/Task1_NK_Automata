package nk_Automata.StatesStructure;


public class AttractorState extends State {
	AttractorStateParameters attractorStateParameters;
	public AttractorState(AttractorStateParameters parameters) {
		super(parameters);
		this.attractorStateParameters=parameters;
	}
	
	public Integer getWeight(){
		return this.attractorStateParameters.getWeight();
	}
	
	public void setWeight(Integer weight){
		this.attractorStateParameters.setWeight(weight);
	}
	
}
