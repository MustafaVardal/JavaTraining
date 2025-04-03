import java.util.ArrayList;
import java.util.List;

public class MyHashSet {

    private List<Integer> data;

    public MyHashSet() {
        data = new ArrayList<>();
    }

    public void add(int key){
        if (!data.contains(key)){
            data.add(key);
        }
    }
    public void remove(int key){
        data.remove(Integer.valueOf(key));
    }
    public boolean contains(int key){
        return data.contains(key);

    }

    public void get(){
        for (Integer datam : data) {
            System.out.print( " " + datam);
        }
    }
}
