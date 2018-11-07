/**
 * Class that handles all of the challenges;
 * */
public class ListChallenges <E>{

	/**
	 * Challenge 1: Find the last element of a list
	 * 
	 * Solution: implemented a linked list with a tail reference; trivial
	 * @return 
	 * */
	public static <E> E findLastElement(LinkedList<E> list) {
		E data = list.getTail().getData();
		
		return data;
	}
	
	
	/**
	 * Challenge 2: Find the last but one element of a list
	 * Throw a NoSuchElementException when list is empty or has one element
	 * 
	 * Solution: Utilize the "get" method that is implented in the LinkedList class
	 * itself; trivial
	 * */
	
	public static <E> E secondLast(LinkedList<E> list) {
		
		if(list.size() == 0 || list.size() == 1) {
			System.out.println("ADD NO SUCH ELEMENT EXCEPTION");
		}
		
		int size = list.size();
		return list.get(size-2);
	}
	
	
	/**
	 * Challenge 3: Find the Kth element of a list
	 * 
	 * Solution: Utilize the implemented get() method in LinkedList class; trivial
	 * */
	public static <E> E findElement(int pos, LinkedList<E> list) {
		
		return list.get(pos);
	}
	
	
	/**
	 * Challenge 4: Find the number of elements in a given list
	 * 
	 * Solution: Utilize the implemented size() method in the LinkedList class; trivial
	 * */
	public static <E> int findListSize(LinkedList<E> list) {
		return list.size();
	}
	
	
	/**
	 * Challenge 5: Reverse a list
	 * 
	 * Solution: Created the method addBeginning; create a new list from the passed in list, adding each element
	 * at the beginning of the list 
	 * */
	
	
	public static <E> LinkedList<E> reverseList(LinkedList<E> list){
		LinkedList<E> newList = new LinkedList<E>();
		
		int i =0;
		
		while(i < list.size()) {
			newList.addBeginning(list.get(i));
			i++;
		}
		
		return newList;	
	}
	
	
	/**
	 * Challenge 6: Find out whether the list is a palindrome
	 * 
	 * Solution: 
	 * 	1) Create a character array (assuming we will only be checking for palindrome on characters)
	 * 	2) convert the elements in the list into a char array
	 * 	3) check each end of the array simultaneously, if one of the characters do not match, it is not a palindrome
	 * */
	
	public static <E> boolean isPalindrome(LinkedList<E> list) {
		
		//create an array to hold each character in the list
		char [] arr = new char[list.size()];
		
		for(int i = 0; i < list.size(); i ++) {
			arr[i] = (char) list.get(i);
		}
		
		int x = 0;
		int y = arr.length - 1;
		
		while( x <= y) {
			if(arr[x] != arr[y]) {
				return false;
			}
			x ++;
			y -- ;
		}
		
		return true;
	}
	
	/**
	 * Challenge 8: Eliminate duplicates in a list
	 * 
	 * Solution: 
	 * 	1) Create a new list
	 * 	2) iterate through each element in the given list
	 * 		2a) if the new list already contains the element, skip
	 * 		2b) if the new list does not contain the element, add it
	 * */
	
	public static <E> LinkedList<E> eliminateDuplicates(LinkedList<E> list){
		LinkedList<E> noDupList = new LinkedList<E>();
		E data = null;
		for(int i = 0; i < list.size(); i++) {
			data = list.get(i);
			
			if(!noDupList.contains(data))
				noDupList.add(data);
		}
		
		return noDupList;
	}
	
}
