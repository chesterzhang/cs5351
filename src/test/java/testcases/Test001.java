package testcases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Samples.*;

public class Test001 {
	 @Test
	 public void testA() {
			assertEquals(3, FloorSquareRoot.floorSqrt(11));
	 }

	 @Test
	 public void testB() {
			assertEquals(4, FloorSquareRoot.floorSqrt(20));
	 }
}


 