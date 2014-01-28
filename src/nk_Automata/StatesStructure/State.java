package nk_Automata.StatesStructure;


/** nk automata state*/
public abstract class State {
	/** the binary form of state number represents automata gene states written sequentially. */ 
	private Integer number;
	/** next state */
	private State next;
	
	public State(){
		this(0,null);
	}
	
	public State(Integer number){
		this(number,null);
	}
	
	
	public State(Integer number,State next){
		this.number=number;
		this.next = next;
	}
	
	
	
	
	
	
}
