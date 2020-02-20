package MapExercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------\n");
        System.out.println("Exercise 1 from Maps : ***");
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> mapToClone = new HashMap<Integer, String>();
        HashMap<Integer, String> containerMap = new HashMap<Integer, String>();
        map1.put(1, "Mary");
        map1.put(2, "Darius");
        map1.put(3, "Andy");

        mapToClone.put(1, "a");
        mapToClone.put(2, "b");
        mapToClone.put(3, "C");
        mapToClone.put(4, "d");
        mapToClone.put(5, "e");
        mapToClone.put(6, "f");


        //1.Map  //1.Map. Write a Java program to append the specified element to the end of a hash set

        MapsEx mp = new MapsEx();
        mp.appendtoMap(map1);
        System.out.println(map1.get(1) + "\n");

        //2.Map. Write a Java program to iterate through all elements in a hash list

        mp.iterateMap(map1);
        System.out.println();

        //3.Map. Write a Java program to get the number of elements in a hash set

        mp.getNrOfElemMap(map1);
        System.out.println();

        //4.Map Write a Java program to empty an hash set

        mp.emptyHashMap(map1);
        System.out.println();


        //5.Map Write a java program to test if a hashset is empty or not
        mp.testIfEmpty(map1);
        System.out.println();

        //6.Map Write a Java program to clone a hash set to another hash set
        mp.cloneAMap(mapToClone,containerMap);
        System.out.println();


        //7.Map Write a Java program to compare 2 hashmaps
        mp.compareMaps(mapToClone,containerMap);
        System.out.println();
    }
}
