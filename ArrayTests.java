import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversedWorking(){
      int[] input = {0,1,2,3,4};
      int[] input2 = {0,1,2,3,4};
      int[] output = {4,3,2,1,0};
      ArrayExamples.reverseInPlace(input);
      assertArrayEquals(output, input);
      assertArrayEquals(output, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input = {1,1,2,3,4};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input));
  }
}
