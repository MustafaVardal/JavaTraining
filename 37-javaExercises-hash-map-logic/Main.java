public class Main {
    public static void main(String[] args) {


        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(0,1);
        myHashMap.put(1,2);
        myHashMap.put(2,3);
        myHashMap.put(3,4);

        System.out.println(myHashMap.get(1));
        myHashMap.remove(1);
        System.out.println(myHashMap.get(1));

    }
}
