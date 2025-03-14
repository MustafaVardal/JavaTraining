import java.util.HashSet;

public class RelatedDataStructure {

    public static void main(String[] args) {


        HashSet<Integer> hNum = new HashSet<>();
        HashSet<Integer> hNum2 = new HashSet<>();


        for (int i = 0; i <= 10; i++) {

            if (hNum.contains(hNum2)) {
                System.out.println(hNum);
            }
            hNum.add(i);
            hNum2.add(i + 9);
        }


        if (hNum.isEmpty()) {
            System.out.println("Empty");
        } else if (hNum.contains(1)) {
            System.out.println("It is contains " + hNum);
        }

        hNum.remove(2);
        System.out.println(hNum);


        System.out.println(hNum2.size());


    }
}



