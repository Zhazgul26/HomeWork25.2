import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet<City> hashSet = new HashSet<>();
        for (int m = 0; m < 10; m++) {
            hashSet.add(new City(random.nextInt(100, 1000), "City" + (m + 1), random.nextInt(100, 1000)));
        }
        System.out.println(hashSet);

        TreeSet<City> treeSet = new TreeSet<>();
        for (City r : hashSet) {
            if (r.getCode() %2 !=0){
                treeSet.add(r);
            }
            System.out.println(treeSet);
        }

    }
}