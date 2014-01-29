package nk_Automata.StatesStructure;




/** nk automata state*/
public class State {
	protected StateParameters parameters;
	
	public State(StateParameters parameters) {
		this.parameters=parameters;
		
	}
	
	public Integer getNumber() {
		return parameters.getNumber();
	}

	public void setNumber(Integer number) {
		this.parameters.setNumber(number);
	}

	public State getNext() {
		return this.parameters.getNext();
	}

	public void setNext(State next) {
		this.parameters.setNext(next);
	}
	
	@Override
	public String toString() {
		
		return "state number:"+this.parameters.getNumber().toString();
	}
	
	
	
}
