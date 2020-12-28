package HW4;

public class Driver {

    public static void main(String[] args) {
        MyMap<String, String> entries =new MyMap<String, String>();
        //Map is empty
        System.out.println("TESTING isEmpty() with no entries:");
        System.out.println("Is the list empty?: " + entries.isEmpty());
        System.out.println();
        	
        //Add to MyMap
        entries.put("Fred","1 Main St");
        entries.put("Mary","2 First St");
        entries.put("Jose","23 Second Avenue");
        entries.put("Leo","10 Lincoln St");
        entries.put("Aubrey","6 Hills Steet");
        
        //Print out the list
        System.out.println("TESTING toString(), and putting elements: ");
        System.out.println(entries.toString());
        System.out.println();

        //Put an existing element
        System.out.println("TESTING put()");
        System.out.println("Putting in a new value with the same key: ");
        entries.put("Leo", "4 Califoronia St");
        System.out.println(entries.toString());
        System.out.println("Putting in a new value with a different key (In this case 'Lionel'): ");
        entries.put("Lionel", "12 California Street");
        System.out.println(entries.toString());
        System.out.println();

        
        //Check if the list is empty
        System.out.println("TESTING isEmpty()");
        System.out.println("Is the list empty?: " + entries.isEmpty());
        System.out.println();
        
        //Check the size of the list
        System.out.println("TESTING size()");
        System.out.println("The size of the list is: " + entries.size());
        System.out.println();
        
        //Get a value with the specific key
        System.out.println("TESTING get()");
        System.out.println("Value with the key 'Aubrey': " + entries.get("Aubrey"));
        System.out.println(entries.get("Marco"));
        System.out.println();
        
        //Remove
        System.out.println("TESTING remove()");
        System.out.println("Remove key that is not in the list (In this case 'Marco'): ");
        entries.remove("Marco");
        System.out.println(entries.toString());
        System.out.println("Remove key 'Jose' from list: ");
        entries.remove("Jose");
        System.out.println(entries.toString());

    }

}
