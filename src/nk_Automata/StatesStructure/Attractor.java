package nk_Automata.StatesStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Attractor{
	private Integer id;
	private ArrayList<AttractorState> attractorStateArray;
	
	public void sortByWeight(){
		Collections.sort(attractorStateArray,new Comparator<AttractorState>() {
		public int compare(AttractorState arg0, AttractorState arg1) {
			return arg0.getWeight()-arg1.getWeight();
		}});
		
	}
	
	public void show(){
		System.out.println("Attractor:"+this.getId().toString());
		for (AttractorState ast: attractorStateArray){
			System.out.println(ast);
		}
	}
	
	public Attractor(Integer id){
		this.setId(id); //attractorId==basinId;		
	}

	public ArrayList<AttractorState> getAttractorStateArray() {
		return attractorStateArray;
	}
	
	public void setAttractorStateArray(ArrayList<AttractorState> attractorStateArray) {
		this.attractorStateArray = attractorStateArray;
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	

}
