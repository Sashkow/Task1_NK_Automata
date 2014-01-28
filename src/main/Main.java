package main;

import nk_Automata.StatesStructure.AttractorState;
import nk_Automata.StatesStructure.AttractorStateParameters;
import nk_Automata.StatesStructure.BasinState;
import nk_Automata.StatesStructure.BasinStateParameters;
import nk_Automata.StatesStructure.FreeStateBuilder;
import nk_Automata.StatesStructure.State;
import nk_Automata.StatesStructure.StateBuilder;
import nk_Automata.StatesStructure.StateParameters;

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
		
		State simplierState1= new AttractorState(42, null, 1);
		
		State simplierState2= new BasinState(43, null, 1, (AttractorState)simplierState1);
		
		
		// Why the factory way is better?
		
		StateBuilder sb= new StateBuilder();
		
		AttractorStateParameters attractorStateParameters=new AttractorStateParameters(new Integer(42), null, 1);
		
		
		State s1=sb.buildState(attractorStateParameters);
		
		BasinStateParameters basinStateParameters=new BasinStateParameters(new Integer(43), null, 1, (AttractorState)s1);
		
		State s2=sb.buildState(basinStateParameters);
		
		System.out.println("Success");
		
		
		
		
	}

}
