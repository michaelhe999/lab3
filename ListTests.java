import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<String>();
        input.add("abc");
        input.add("def");
        assertEquals(input, ListExamples.filter(input, new checkOrder()));
    }

    @Test
    public void testMergeNull(){
        List<String> input1 = null;
        List<String> input2 = null;
        List<String> output = new ArrayList<>();
        assertEquals(output, ListExamples.merge(input1,input2));
    }

    @Test
    public void testMergeEmpty(){
        List<String> input1 = new ArrayList<>();
        List<String> input2 = new ArrayList<>();
        input2.add("a");
        assertEquals(input2, ListExamples.merge(input1,input2));
    }
}
