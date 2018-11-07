/**
 * Class to test basic functionality of the list I will be using
 * */
public class ListTest {

	public static void main(String [] args) {

		LinkedList<Integer> myList = new LinkedList<Integer>();
 
		myList.add(1); //0
		myList.add(2); //1
		myList.add(3); //5


		for(int i=0; i < myList.size(); i++) {
			System.out.println("myList[" + i + "]: " + myList.get(i));
		}
	}

}
