import org.junit.Test;

import static org.junit.Assert.assertThat;
import org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class ListTests {
	
	//CHALLENGE 1: tests the findLastElement() method from ListChallenges.java
	@Test 
	public void findLastElementFromAList() {
		LinkedList<Character> testList = new LinkedList<Character>();
		testList.add('a');
		testList.add('b');
		testList.add('c');
		testList.add('d');
		
		assertThat(ListChallenges.findLastElement(testList), is(equalTo('d')));
	}
	
	
	//CHALLENGE 2: tests the secondLast() method from ListChallenges.java
	@Test
	public void test_findSecondLast() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0); list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); 
		assertThat(ListChallenges.secondLast(list), is(equalTo(4)));
	}
	
	
	//CHALLENGE 3: tests the findElement() method from ListChallenges.java
	// ADD MORE TESTS FOR ERROR HANDLING
	@Test
	public void test_findKthElement() {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		for(int i = 0; i < 100; i++) {
			nums.add(i);
		}
		
		assertThat(ListChallenges.findElement(50, nums), is(equalTo(50)));
	}
	
	
	//CHALLENGE 4: tests the size() method from ListChallenges.java
	@Test
	public void test_getSize() {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		for(int i = 0;i < 100; i ++) {
			nums.add(i);
		}
		
		assertThat(ListChallenges.findListSize(nums), is(equalTo(100)));
	}
	
	
	//CHALLENGE 5: tests the reverseList() method from ListChallenges.java
	@Test
	public void test_reverseList() {
		//original list
		LinkedList<Integer> nums = new LinkedList<Integer>();
		for(int i =0; i < 100; i ++) {
			nums.add(i);
		}
		
		//list after reverse nums
		LinkedList<Integer> revList = ListChallenges.reverseList(nums); 
		
		for(int i = 99; i <= 0; i--) {
			assertThat(revList.get(i), is(equalTo(i)));
		}
		
	}
	
	
	//CHALLENGE 6: test the isPalindrome() method from ListChallenges.java
	@Test
	public void testIsPalindrome() {
		LinkedList<Character> word = new LinkedList<Character>();
		word.add('x'); word.add('a'); word.add('m'); word.add('a'); word.add('x');
		
		assertThat(ListChallenges.isPalindrome(word), is(equalTo(true)));
	}
	
	
	//CHALLENGE 8: test the eliminateDuplicate method from ListChallenges.java
	@Test
	public void testEliminateDuplicates() {
		LinkedList<Integer> duplicateList = new LinkedList<Integer>();
		duplicateList.add(0); duplicateList.add(0);
		duplicateList.add(1); duplicateList.add(1);
		duplicateList.add(2); duplicateList.add(2);
		duplicateList.add(3); duplicateList.add(3);
		
		LinkedList<Integer> noDup = ListChallenges.eliminateDuplicates(duplicateList);
		
		for(int i = 0; i < 4; i ++) {
			assertThat(noDup.get(i), is(equalTo(i)));
		}
	}
}
