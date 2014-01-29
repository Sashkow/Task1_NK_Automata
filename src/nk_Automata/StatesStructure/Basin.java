package nk_Automata.StatesStructure;

import java.util.ArrayList;

public class Basin {
	private static Integer globalBasinId=0;
	private Integer id;
	private Attractor attractor;
	private ArrayList<BasinState> basinStateArray;
	
	public Basin() {
		this.setId(globalBasinId++);
	}

	public ArrayList<BasinState> getBasinStateArray() {
		return basinStateArray;
	}

	public void setBasinStateArray(ArrayList<BasinState> basinStateArray) {
		this.basinStateArray = basinStateArray;
	}

	public Attractor getAttractor() {
		return attractor;
	}

	public void setAttractor(Attractor attractor) {
		this.attractor = attractor;
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}
	

}
