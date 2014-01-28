package main;

import nk_Automata.StatesStructure.FreeStateBuilder;
import nk_Automata.StatesStructure.State;
import nk_Automata.StatesStructure.StateBuilder;

/*
 * Task1. Automata States
 * -Define states hierarchy.
 * State
 * 		BasinState
 * 		AttractorState
 * -Create some state objects.
 * 		Map<State,State> - State-nextState
 * -Create stateStructure of different state types
 * 		StatesStructure:
 * 			Basins:
 * 				basin states
 * 				Attractors
 * 					attractor states
 * 		Algorithm: 
 * 			Go through states,store them, encounter a cycle, cycle->attractor, rest->basin;
 * 			Continue go through states which not in graph:
 * 				encounter a cycle
 * 				or
 * 				encounter state in graph
 * 				
 * Sort basin states by weight (amount of incomming states)
 * 
 * Find state of certain weight
 */
public class Main {
	public static void main(String[] args){
		StateBuilder fsb= new FreeStateBuilder();
		
		//State s1;
		State s1 = fsb.buildState();
		
		
		
	}

}
