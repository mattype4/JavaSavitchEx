package chapter12;
import chapter10.*;

import java.util.ArrayList;


public class ArrayListSpecies{
	
	public ArrayList<Species> sortSpecies(ArrayList<Species> list){
		Species temp = null;
		
		for(int i=0; i<list.size(); i++){
			
			for (int j=0; j<list.size()-1; j++){
				if (list.get(j).compareTo(list.get(j+1)) > 0){
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		
		return list;
	}
	


	
}
