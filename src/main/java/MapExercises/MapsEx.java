package MapExercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsEx {


    void appendtoMap(HashMap<Integer, String> map){
        map.put(12,"Ionut");
    }

    void iterateMap(HashMap<Integer,String> map){
        System.out.println("Exercise 2 from Maps : ***");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> pair = (Map.Entry<Integer, String>) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }

    void getNrOfElemMap(HashMap<Integer, String> map) {
        System.out.println("Exercise 3 from maps : ***");
        System.out.println("the number of elements in the map is: \n" + map.size());
    }

    void emptyHashMap(HashMap<Integer, String> map){
        System.out.println("Exercise 4 from maps : ***");
        map.clear();
        System.out.println("the nr of elements after clear : \n" + map.size());
    }

    void testIfEmpty(HashMap<Integer, String> map){
        System.out.println("Exercise 5 from maps : ***");
        if (map.isEmpty()) {
            System.out.println("The set is emtpy");
        } else {
            System.out.println("The set is NOT empty");
        }
    }

    void cloneAMap(HashMap<Integer, String> mapToClone, HashMap<Integer, String> containerMap){
        System.out.println("Exercise 6 from maps: ****");
        System.out.println("Map to be cloned looks like : " + mapToClone);
        containerMap = (HashMap) mapToClone.clone();
        System.out.println("The cloned map is : " + containerMap);
    }

    void compareMaps(HashMap<Integer, String> comparedMap1, HashMap<Integer, String> comparedMap2){
        System.out.println("Exercise 7 from maps : ****");
        if(comparedMap1.equals(comparedMap2)){
            System.out.println("The maps are the same");
        }
        else System.out.println("The maps are NOT the same");
    }
}
