package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("유영근", 85);
        map.put("윤서하", 90);
        map.put("오동욱", 80);
        map.put("김영신", 95);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "김영신";
        int value = map.get(key);
        System.out.println(key + ": " + map.get("김영신"));
        System.out.println();
        
        // 키로 엔트리 삭제
        map.remove("김영신");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // 키 Set 컬렉션을 얻고, 반복해서 값 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();


	}

}
