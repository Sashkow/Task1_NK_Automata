package nk_Automata.StatesStructure;




/** nk automata state*/
public abstract class State {
	/** the binary form of state number represents automata gene states written sequentially. */ 
	protected Integer number;
	/** next state */
	protected State next;
	protected Integer weight;
	
	public State(Integer number,State next) {
		this.number=number;
		this.next=next;
	}
	
	
	
}
