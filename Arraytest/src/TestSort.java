import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSort {

    @Test
    public void testsort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        // String[] expected = {"I", "have", "an", "egg"};
     /*   if (input != expected) {
            System.out.println("errpr");
        }
*/
     /*   if (!java.util.Arrays.equals(input, expected)) {
            System.out.println("error");
        } else {
            System.out.println("true");
        }
*/
        //System.out.println(org.junit.Assert.assertEquals(expected, input));
        Sort.sort(input);
        assertEquals(input, expected);

    }

    @Test
    //Test the Sort.findSmallest method
    public void testFindSmallest() {
        String[] input = {"b", "c", "artist", "d"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);
        assertEquals(expected, actual);
    }

    @Test
    //test swap method
    public void testSwap() {
        String[] input = {"I", "am", "a", "boy"};
        int a = 0;
        int b = 2;

        String[] expected = {"a", "am", "I", "boy"};
        Sort.swap(input, a, b);
        assertEquals(expected, input);
    }


}
