package nk_Automata.StatesStructure;


public class BasinState extends State{
	
	private Integer basinId;
	private AttractorState firstAttractorState;
	
	public BasinState(Integer number, State next, Integer basinId,AttractorState firstAttractorState) {
		super(number, next);
		this.basinId=basinId;
		this.firstAttractorState=firstAttractorState;
	}
	


}
