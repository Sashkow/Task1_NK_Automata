package nk_Automata.StatesStructure;

public class StateParameters {
	Integer number;
	State next;
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}

	public StateParameters(Integer number, State next) {
		this.number=number;
		this.next=next;
		
	}

}
