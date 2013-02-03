package chapter12;

public interface QueueFace<T> {
	public void addToQueue(T item);
	public T removeFromQueue();
	public boolean isEmpty();
	public void printOut();
	
}
