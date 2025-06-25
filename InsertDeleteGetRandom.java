import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {

    Map<Integer, Integer> dict;
    List<Integer> list;
    Random rand = new Random();

    public RandomizedSet(){
        dict = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val){
        // Insert a value to the set, return true if the element not already in the set
        if (dict.containsKey(val)) return false;

        dict.put(val, list.size()); // dict.put() means to add a key-value pair to the HashMap or to update the value for the existing key
        list.add(list.size(), val); // list.size() returns the current number of element in the list. list.add(list.size(), val) inserts
        // val to the last element of the list, which means append it. this is equivalent to list.add(val)
        return true;
    }

    public boolean remove(int val){
        if (! dict.containsKey(val)) return false; // if not contain in the set, no need to remove
        int lastElement = list.get(list.size() - 1);
        int idx = dict.get(val); // dict.get(val) retrieves the value associated with the key, val, from the HashMap
        list.set(idx, lastElement); // This is the method used to replace the value associated with the key, idx, with the lastElement
        dict.put(lastElement, idx); // update the key-value pair at the position, idx, with lastElement
        list.remove(list.size() - 1); // delete the value
        dict.remove(val); // delete the key
        return true;
    }

    public int getRandom(){
        return list.get(rand.nextInt(list.size()));
    }

    // Time Complexity: O(n) which insert and delete both takes an average of O(1). In the worst case, the operations exceed
    // the current allocated capatity in the HashMap / Array, and invokes space reallocation
    // Space Complexity: O(n) to store N elements
}
