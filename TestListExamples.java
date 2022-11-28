import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

class containsLetterA implements StringChecker{
  public boolean checkString(String s) {
    return s.contains("a") || s.contains("a");
  }
}
public class TestListExamples {
  @Test(timeout = 100)
  public void testTimeout() {
    while(true) {}
  }
  @Test(timeout = 1000)
  public void testFilter() {
    List<String> input1 = new ArrayList<String>(Arrays.asList("apple", "greed", "", "AAAAAaaa", "  a "));
    assertEquals(new ArrayList<String>(Arrays.asList("apple", "AAAAAaaa", "  a ")), ListExamples.filter(input1, new containsLetterA()));
  }

@Test(timeout=1000)
  public void testMerge() {
    List<String> input1 = new ArrayList<String>(Arrays.asList("a", "c", "e"));
    List<String> input2 = new ArrayList<String>(Arrays.asList("b", "d", "f"));
    List<String> output = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f"));
    assertEquals(output, ListExamples.merge(input1, input2));
  }
}
