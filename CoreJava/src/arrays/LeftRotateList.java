
package arrays;
import java.util.*;

public class LeftRotateList {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        
        // Read one full line of numbers
        String[] inputs = scn.nextLine().split(" ");
        
        for (String s : inputs) {
            list.add(Integer.parseInt(s));
        }

        // Perform right rotation by 1
        int last = list.remove(list.size() - 1); // remove last element
        list.add(0, last);                       // add it to the front

        // Print rotated list
        for (int num : list) {
            System.out.print(num + " ");
        }

        scn.close();
    }
}
