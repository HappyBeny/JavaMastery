package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map는 Key - Vlaue 페어 구조인 것이 중요함.
        // key라는 값으로 unique하게 보장이 돼야 함
        // Map -> HashMap, TreeMap로 응용

        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15); //같은 키가 여러 개면, 마지막 밸류로 덮어씀.

        for (String key : intMap.keySet()) {
            System.out.println(key);
        }


        for (Integer vlaue : intMap.values()){
            System.out.println(vlaue);
        }

        System.out.println(intMap.get("삼"));
    }
}
