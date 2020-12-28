package HW4;

//Start with a MyEntry class with a String key and String value, plus any methods you need.

//https://www.w3schools.com/java/java_constructors.asp
public class MyEntry <K, V>  {
	//Data fields
	private String key;
	private String value;

	//Constructor
	public MyEntry (K key, V value) {
		this.key = (String) key;
		this.value = (String) value;
	}

	//Getters and Setters for proper encapsulation 
	public String getKey() {
		// TODO Auto-generated method stub
		return key;
	}
	
	public K setKey(K key) {
		return (K) key;
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	public V setValue(V value) {
		return (V) value;
	}
}