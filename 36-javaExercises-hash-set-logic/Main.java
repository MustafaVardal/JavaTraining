public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        for (int i = 0; i < 10; i++) {
            myHashSet.add(i);
        }


        myHashSet.add(2);

        myHashSet.remove(5);

        System.out.println(myHashSet.contains(4));
        myHashSet.get();

    }
}
