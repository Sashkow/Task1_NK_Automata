package nk_Automata.StatesStructure;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import sun.security.provider.certpath.BuildStep;





public class StatesStructure {
	private ArrayList<State> statesArray;
	private ArrayList<Basin> basinArray;
	private static final int DEFAULTSTRUCTURESIZE=8;
	private int size;
	
	
	public StatesStructure() {
		this.setSize(DEFAULTSTRUCTURESIZE);
		
		
	}
	public void setStatesArray(ArrayList<State> statesArray) {
		this.statesArray = statesArray;
	}
	public void setBasinArray(ArrayList<Basin> basinArray) {
		this.basinArray = basinArray;
	}
	
	public ArrayList<State> getStatesArray() {
		return statesArray;
	}
	public ArrayList<Basin> getBasinArray() {
		return basinArray;
	}
	
	/**
	 * 
	 * @param seed
	 */
	
	public void showSimpleStructure(){
		System.out.println("state -> nextState");
		for(int i=0;i<this.getSize();i++){
			System.out.println(statesArray.get(i)+" --> "+statesArray.get(i).getNext());
		}
	}
	

	public void showStructure(){
		for (Basin basin: this.basinArray){
			System.out.println("Basin:"+basin.getId().toString());
			System.out.println("Basin States");
			for (BasinState basinState: basin.getBasinStateArray()){
				System.out.println("	"+basinState);
			}
			System.out.println("Attractor States");
			for (AttractorState attractorState: basin.getAttractor().getAttractorStateArray()){
				System.out.println("	"+attractorState);
			}
		}		
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	
			
	
}
