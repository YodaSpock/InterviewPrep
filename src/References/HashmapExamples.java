package References;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapExamples {

    public static void main(String[] args) {
        //Hashmap Example

        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("Isaac", "8159802527");
        phonebook.put("Joel", "8152223339");


        //Get all the keys

        Set<String> keys = phonebook.keySet();
        for(String i : keys){
            System.out.println(i + ": " + phonebook.get(i));
        }

        //All the keys and values
        Set<Map.Entry<String, String>> values = phonebook.entrySet();

        for(Map.Entry<String, String> e : values){
            System.out.println(e.getKey() + ": " + e.getValue());
            e.setValue("III");
        }
    }
}
