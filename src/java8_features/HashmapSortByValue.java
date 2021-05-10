package java8_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashmapSortByValue {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",4);
        map.put("b",2);
        map.put("c",3);
        print(map, "Before Sorting by Value");

        Map<String, Integer> sortedMap = prepareSortedMap(map);
        print(sortedMap, "After the sorting is performed : ");

    }

    public static void print(Map<String, Integer> map, String message) {
        if (map == null || map.isEmpty())
            return;
        System.out.println(message);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public static Map<String, Integer> prepareSortedMap(Map<String, Integer> map) {

        if (map==null || map.isEmpty())
            return null;

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        list.stream().forEach(obj -> linkedHashMap.put(obj.getKey(), obj.getValue()));
        return linkedHashMap;
    }

}
