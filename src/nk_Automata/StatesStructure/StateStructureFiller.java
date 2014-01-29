package nk_Automata.StatesStructure;

import java.util.ArrayList;


public class StateStructureFiller {
	
	/**
	 * Fill StateStructure object with ArrayList<Basin> to describe state graph on the image "DecimalGraph.png" in a detailed way.
	 * @param sts
	 */
	public static void fillWithFixedStructure(StatesStructure sts){
		
		StateBuilder sb =new StateBuilder();
		
		ArrayList<Basin> basinArray=new ArrayList<Basin>();
		
		Basin basin0=new Basin();
			int zeroBasinId=0;
			
			Attractor attractor0=new Attractor(zeroBasinId);
			ArrayList<AttractorState> attractor0StateArray=new ArrayList<AttractorState>();
			AttractorStateParameters attractor0Parameters;
			
				attractor0Parameters=new AttractorStateParameters(0, null, zeroBasinId);
				AttractorState ast0= new AttractorState(attractor0Parameters);
				ast0.setWeight(2);
				
				
				attractor0Parameters=new AttractorStateParameters(7, null, zeroBasinId);
				AttractorState ast7= new AttractorState(attractor0Parameters);
				ast0.setNext(ast7);
				ast7.setWeight(0);

				attractor0Parameters=new AttractorStateParameters(3, null, zeroBasinId);
				AttractorState ast3= new AttractorState(attractor0Parameters);
				ast7.setNext(ast3);
				ast3.setNext(ast0);
				ast3.setWeight(0);
				
				attractor0StateArray.add(ast0);
				attractor0StateArray.add(ast7);
				attractor0StateArray.add(ast3);
				
				
			attractor0.setAttractorStateArray(attractor0StateArray);
			basin0.setAttractor(attractor0);
			
			ArrayList<BasinState> basin0StateArray=new ArrayList<BasinState>();
			
			BasinStateParameters basin0Parameters;
				basin0Parameters=new BasinStateParameters(2,null,zeroBasinId,null);
				BasinState bst2= new BasinState(basin0Parameters);
				
				basin0Parameters=new BasinStateParameters(1,null,zeroBasinId,null);
				BasinState bst1= new BasinState(basin0Parameters);
				bst2.setNext(bst1);
				bst1.setNext(ast0);
			
			basin0StateArray.add(bst2);
			basin0StateArray.add(bst1);
			
			basin0.setBasinStateArray(basin0StateArray);
			
			
			
			/////////////////////////////////1
				
				
			Basin basin1=new Basin();
			 zeroBasinId=1;
			
			Attractor attractor1=new Attractor(zeroBasinId);
			ArrayList<AttractorState> attractor1StateArray=new ArrayList<AttractorState>();
			AttractorStateParameters attractor1Parameters;
			
				attractor1Parameters=new AttractorStateParameters(4, null, zeroBasinId);
				AttractorState ast4= new AttractorState(attractor1Parameters);	
				ast4.setWeight(1);
				
				attractor1Parameters=new AttractorStateParameters(6, null, zeroBasinId);
				AttractorState ast6= new AttractorState(attractor1Parameters);
				ast6.setWeight(0);
				ast4.setNext(ast6);
				ast6.setNext(ast4);
				
				
				
				attractor1StateArray.add(ast4);
				attractor1StateArray.add(ast6);
				
			attractor1.setAttractorStateArray(attractor1StateArray);
			basin1.setAttractor(attractor1);
			
			ArrayList<BasinState> basin1StateArray=new ArrayList<BasinState>();
			
			BasinStateParameters basin1Parameters;
				basin1Parameters=new BasinStateParameters(5,null,zeroBasinId,null);
				BasinState bst5= new BasinState(basin1Parameters);
				bst5.setNext(ast4);
		
			basin1StateArray.add(bst5);
			
			basin1.setBasinStateArray(basin1StateArray);
			
		basinArray.add(basin0);
		basinArray.add(basin1);
		
		sts.setBasinArray(basinArray);
		
		
	}
	/**
	 * Fill StateStructure object with ArrayList<State> to describe state graph on the image "DecimalGraph.png" in a simple way.
	 * @param sts
	 */
	public static void fillWithSimpleFixedStructure(StatesStructure sts){
	
		ArrayList<State> statesArray= new ArrayList<State>();
		StateBuilder sb=new StateBuilder();
		StateParameters stateParameters;
		
		
		for(int i=0;i<sts.getSize();i++){
			stateParameters=new StateParameters(i, null);
			statesArray.add(sb.buildState(stateParameters));
		}
		
		statesArray.get(0).setNext(statesArray.get(7));
		statesArray.get(1).setNext(statesArray.get(0));
		statesArray.get(2).setNext(statesArray.get(1));
		statesArray.get(3).setNext(statesArray.get(0));
		statesArray.get(4).setNext(statesArray.get(6));
		statesArray.get(5).setNext(statesArray.get(4));
		statesArray.get(6).setNext(statesArray.get(4));
		statesArray.get(7).setNext(statesArray.get(3));
		
		sts.setStatesArray(statesArray);
		
		
	}


}
