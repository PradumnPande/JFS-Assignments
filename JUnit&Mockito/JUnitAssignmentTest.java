package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAssignmentTest {

	@Test
	void test() {
		int[] actual={56,34,7,3,54,3,34,34,53};
		int[] actual1={0};
		int [] expected={3,56};
		assertArrayEquals(expected ,MinMaXFinder.findMinMax(actual));
		 for (int i=0;i<actual1.length; i++) { 
		     assertNotNull(actual1[i]);
		   }
	}

}

