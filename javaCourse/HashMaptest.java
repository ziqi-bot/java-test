package javaCourse;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaptest {


    @Test
    public void test1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tom", 22);
        map.put("Jerry", 21);


//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        var entrySet= map.entrySet();
        var iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }







}
