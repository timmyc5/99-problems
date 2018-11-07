/**
 * I have decided to make my own list class in order to give me more freedom
 * when working on the challenges
 * */
public class Listnode <E>{

	//FIELDS
	private E data;
	private Listnode<E> next;
	
	//CONSTRUCTOR
	public Listnode(E data) {
		this.data = data;
		this.next = null;
	}
	
	//ACCESSORS
	public E getData() {
		return this.data;
	}
	
	public Listnode<E> getNext(){
		return this.next;
	}
	
	//MUTATORS
	public void setData(E data) {
		this.data = data;
	}
	
	public void setNext(Listnode<E> next) {
		this.next = next;
	}
}
