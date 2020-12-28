// Sources used: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html

package HW4;

import java.util.Iterator;
import java.util.LinkedList;

//Call your Map class MyMap.
public class MyMap<K, V> {

	//The class should have a LinkedList of MyEntries and is empty
	//Remember that your Key and Value are Strings
	LinkedList<MyEntry<K, V>> linkedList = new LinkedList<MyEntry<K, V>>();

	//isEmpty
	public boolean isEmpty() {
		if (linkedList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

	//size()
	public int size() {
		return linkedList.size();
	}

	/* put takes a key and a value. If there is already an entry with that key, it substitutes the new value for the existing one. 
	 * If not, it adds a new entry. Put can be void, or it can return 0 if it created a new entry and 1 if it updated an entry.
	 */

	public V put(K key, V value) {
		for(MyEntry<K, V> input:linkedList) {
			if(input.getKey().equals(key)) {
				input.setValue((V) value);
				return (V) value;
			}
		}
		MyEntry<K, V> newEntry=new MyEntry<K, V>(key, value);
		linkedList.add(newEntry);
		return (V) value;
	}

	/* get takes a key and returns a value if there is one with that key (a key equal to the key taken by the method as a parameter 
	 * according to String's equals() method). Else, it should throw an exception, which you should handle with a try-catch.
	 */

	//Source: https://www.w3schools.com/java/java_try_catch.asp
	
	@SuppressWarnings("unchecked")
	public V get(K key) {
		try {
			for(MyEntry<K, V> input:linkedList) {
				if(input.getKey().equals(key)) {
					return (V) input.getValue();
				}
			}
			throw new Exception();
		}
		catch (Exception exception) {
			System.out.println("Values without the key in the list: ");
			System.out.println("Exception error");
		}
		return null;
	}

	/* Remove(String key) takes a key. If there is an entry whose key is equal to the key supplied as a parameter, according to 
	 * String's equals() method, remove deletes it from the list and returns 1.  If there is no entry with that key, remove returns 0. 
	 */

	//Sources: https://dzone.com/articles/removing-elements-from-a-map-in-java
	//         https://javarevisited.blogspot.com/2017/08/how-to-remove-key-value-pair-from-map-iteration-java-example.html
	
	public int remove(String key) 
	{
		Iterator<MyEntry<K, V>> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getKey().equals(key)) {
				iterator.remove();
				return 1;
				}
			}
		return 0;
		}

	/*toString() returns a single string that contains a list of all the keys and values in the Map. For example, if the Map 
	 * mapped names to addresses, the toString() would return a String with a format similar to this:
	 * Fred: 1 Main St; Mary: 2 First St; Jose: 23 Second Avenue
	 */	  

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		for(MyEntry<K, V> input:linkedList) {
			string.append(input.getKey() + ": " + input.getValue() +"; ");
		}
		return string.toString();
		}
}
