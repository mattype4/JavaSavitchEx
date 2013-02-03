package chapter12;

public class Queue<T> implements QueueFace<T>{
	private Node front;
	private int count=0;
	
	public Queue(){
		front = null;
	}
	
	public Queue(Node theHead){
		front = theHead;
		count++;
	}
	
	public void addToQueue(T newData){
		Node temp = front;
		if (temp == null){
			front = new Node(newData,null);
			return;
		}
		for(int i=0; i<count; i++)
			temp = temp.getLink();
		temp.setLink(new Node(newData, null));
		count++;
	}
	
	public T removeFromQueue(){
		try{
			if (front == null)
				throw new NoNodeException();
			Node temp = front;
			front = front.getLink();
			count--;
			return temp.getData();
		} catch (NoNodeException e){
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean isEmpty(){
		if (front == null)
			return true;
		else
			return false;
	}
	
	public void printOut(){
		Node temp = front;
		while (temp != null){
			System.out.println(temp.getData());
			temp = temp.getLink();
		}
	}
	
	
	private class Node{
		private T data;
		private Node link;
		
		public Node(){
			data = null;
			link = null;
		}
		public Node(T theData, Node theLink){
			data = theData;
			link = theLink;
		}
		public T getData(){
			return data;
		}
		public Node getLink(){
			return link;
		}
		public void setData(T newData){
			data = newData;
		}
		public void setLink(Node newLink){
			link = newLink;
		}
		
	}
}
