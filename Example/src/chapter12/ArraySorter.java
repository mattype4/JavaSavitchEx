package chapter12;
import java.util.ArrayList;

public class ArraySorter{

	public ArrayList<String> selectionSort(ArrayList<String> list){
		String min="";
		int index=0;
		for (int i=0; i<list.size()-1; i++){
			min = list.get(i);
			index = i;
			for (int j=i+1; j<list.size(); j++){
				if (list.get(j).compareTo(min)<0){
					min = list.get(j);
					index = j;
				}
			}
			list.set(index, list.get(i));
			list.set(i, min);
		}	
		return list;
	}
	
	public ArrayList<String> insertionSort(ArrayList<String> list){
		String key="", temp="";
		int index=0;
		for(int i=0; i<list.size()-1; i++){
			key = list.get(i+1);
			index = i;
			
			while ( index >= 0 && key.compareTo(list.get(index)) < 0 ){

				temp = list.get(index);
				list.set(index, key);
				list.set(index+1, temp);
				index--;
				
			}
		}
		
		return list;
	}
	
	public ArrayList<String> bubbleSort(ArrayList<String> list){
		String temp="";
		
		for(int i=0; i<list.size(); i++)
			for(int j=0; j<list.size()-1; j++){
				if(list.get(j).compareTo(list.get(j+1))>0){
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		return list;
	}
}
