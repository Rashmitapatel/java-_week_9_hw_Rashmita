package calculate;

import java.util.HashSet;

public class Programme_8_HashSet {
    public static void main(String[] args) {


        HashSet<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 0; i<= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}