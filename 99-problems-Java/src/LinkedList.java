/**
 * Class to represent the list Data Structure that I will use for the
 * daily challenges ; decided to go with a LinkedList
 **/

public class LinkedList <E>{

	// FIELDS
	private Listnode<E> head;
	private Listnode<E> tail;
	private int numElements;

	//CONSTRUCTOR
	public LinkedList() {
		this.head = new Listnode<E>(null);
		this.tail = new Listnode<E>(null);
		this.numElements = 0;
	}

	//METHODS

	/**
	 * Method that adds a new node to the END of a list
	 * */
	public void add (E data) {
		Listnode<E> newNode = new Listnode<E>(data);

		//first node being added set it to head
		if(numElements == 0) {
			this.head = newNode;
			this.tail = newNode;
			numElements ++;
		}
		//else, add it to the END of the list
		else {	
			this.tail.setNext(newNode);
			this.tail = newNode;
			numElements ++;
		}
	}

	public void addBeginning(E data) {
		Listnode<E> newNode = new Listnode<E>(data);

		//first node being added set it to head
		if(numElements == 0) {
			this.head = newNode;
			this.tail = newNode;
			numElements ++;
		}
		else {
			newNode.setNext(head);
			this.head = newNode;
			numElements ++;
		}
	}
	/**
	 * Method that creates a new node with the given data and 
	 * inserts it at the given position 
	 **/
	public void addPos(int pos, E data) {
		//check if inserting at the HEAD or TAIL
		Listnode<E> newNode = new Listnode<E>(data);

		if(pos < 0 || pos > numElements) {
			//throw an out of bounds exception
			System.out.println("ADD OUT OF BOUNDS EXCEPTION");
		}
		if(pos == 0) {
			newNode.setNext(head);
			this.head = newNode;
			numElements ++;		
		}
		else if(pos == numElements) {
			this.tail.setNext(newNode);
			this.tail = newNode;
			numElements++;
		}
		else {
			Listnode<E> tmp = head;

			for(int i = 0; i < pos - 1; i++) {
				tmp = tmp.getNext();
			}
			newNode.setNext(tmp.getNext());
			tmp.setNext(newNode);

			numElements++;
		}
	}

	/**
	 * Inserted to accomplish challenge 1; get the last element of the list
	 * */
	public Listnode<E> getTail(){
		return this.tail;
	}

	/***
	 * Returns the number of elements currently in the list
	 */
	public int size() {
		return this.numElements;
	}

	/**
	 * Method to return element i's data in the list
	 * */

	public E get(int pos) {
		Listnode<E> tmp = head;

		for(int i = 0; i < pos; i++) {
			tmp = tmp.getNext();
		}

		return tmp.getData();
	}
	
	public boolean contains(E data) {
		Listnode<E> tmp = head;
		
		for(int i = 0; i < numElements; i++) {
			if(tmp.getData().equals(data))
				return true;
			
			tmp = tmp.getNext();
		}
		
		return false;
	}

}
