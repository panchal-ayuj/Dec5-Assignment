import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class BinaryHashMap {
    private HashMap<Object, ArrayList<String>> bm;

    public BinaryHashMap() {
        bm = new HashMap<>();
    }

    public void put(Object key, String val) {
        Object keyOfMap = Math.abs((key.hashCode() % 2));
        System.out.println(keyOfMap);
        if(bm.containsKey(keyOfMap)) {
            bm.get(keyOfMap).add(val);
        } else {
            bm.put(keyOfMap, new ArrayList<>(Arrays.asList(val)));
        }
    }

    public Object get(Integer key) {
        return bm.get(key);
    }



    public static void main(String[] args) {
        BinaryHashMap bm = new BinaryHashMap();

        Student s1 = new Student("Lahari", 0);
        Student s2 = new Student("Radhika", 50);
        Student s3 = new Student("Mythri", 20);
        Student s4 = new Student("Abc", 10);
        Student s5 = new Student("Def", 15);
        Student s6 = new Student("Ghi", 25);

        bm.put(s1, "Val1");
        bm.put(s2, "Val2");
        bm.put(s3, "Val3");
        bm.put(s4, "Val4");
        bm.put(s5, "Val5");
        bm.put(s6, "Val6");

        System.out.println(bm.get(0));
        System.out.println(bm.get(1));

    }
}