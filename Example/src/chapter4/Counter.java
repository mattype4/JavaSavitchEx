package chapter4;

public class Counter {
	private int count;
	public void initCounter(){
		count = 0;
	}
	
	public void incCount(){
		count ++;
	}
	
	public void decCount(){
		if (count == 0)
			return;
		count --;
	}
	
	public int getCount(){
		return count;
	}
	
	public void output(){
		System.out.println("The count is at:  " + count);
	}
}
