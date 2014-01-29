package main;

import nk_Automata.StatesStructure.AttractorState;
import nk_Automata.StatesStructure.AttractorStateParameters;
import nk_Automata.StatesStructure.BasinState;
import nk_Automata.StatesStructure.BasinStateParameters;
import nk_Automata.StatesStructure.State;
import nk_Automata.StatesStructure.StateBuilder;
import nk_Automata.StatesStructure.StateParameters;
import nk_Automata.StatesStructure.StateStructureFiller;
import nk_Automata.StatesStructure.StatesStructure;

/*
 * Task1. Automata States
 * -Define states hierarchy.
 * State
 * 		BasinState
 * 		AttractorState
 * 
 * -Create some state objects.
 * 		
 * 
 * -Create stateStructure of different state types
 * 		StatesStructure:
 * 			Basins:
 * 				basin states
 * 				Attractors:
 * 					attractor states
 * 				
 * -Sort attractor states by weight (amount of incomming states)
 * 

 */
public class Main {
	public static void main(String[] args){
		
		//State simplierState1= new AttractorState(42, null, 1);
		
		//State simplierState2= new BasinState(43, null, 1, (AttractorState)simplierState1);
		
		// Why the factory way is better?
		
		StateBuilder sb= new StateBuilder();
		
		AttractorStateParameters attractorStateParameters=new AttractorStateParameters(new Integer(42), null, 1);
		
		
		State s1=sb.buildState(attractorStateParameters);
		
		BasinStateParameters basinStateParameters=new BasinStateParameters(new Integer(43), null, 1, (AttractorState)s1);
		
		State s2=sb.buildState(basinStateParameters);
		
		
		
		StatesStructure stateStructure=new StatesStructure();
		
		StateStructureFiller.fillWithSimpleFixedStructure(stateStructure);
		
		StateStructureFiller.fillWithFixedStructure(stateStructure);
		
		
		stateStructure.showSimpleStructure();
		stateStructure.showStructure();
		
		
		System.out.println("BeforeSort");
		stateStructure.getBasinArray().get(0).getAttractor().show();
		
		stateStructure.getBasinArray().get(0).getAttractor().sortByWeight();
		
		System.out.println("AfterSort");
		stateStructure.getBasinArray().get(0).getAttractor().show();
		
		
		System.out.println("Success");
		
		
		
		
	}

}
