package study.day08_Dictionaies_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args){
        //English to Korean Dictionary
        Map<String,String> engKorDictionary = new HashMap<String, String>();
        engKorDictionary.put("Monday","월요일");
        engKorDictionary.put("Tuesday","화요일");
        engKorDictionary.put("Wednesday","수요일");
        engKorDictionary.put("Thursday","목요일");
        engKorDictionary.put("Friday","금요일");
        engKorDictionary.put("Saturday","토요일");
        engKorDictionary.put("Sunday","일요일");

        //Retrieve things from our Dictionary
        System.out.println(engKorDictionary.get("Monday"));
        System.out.println(engKorDictionary.get("Tuesday"));
        System.out.println(engKorDictionary.get("Wednesday"));
        System.out.println(engKorDictionary.get("Thursday"));
        System.out.println(engKorDictionary.get("Friday"));
        System.out.println(engKorDictionary.get("Saturday"));
        System.out.println(engKorDictionary.get("Sunday"));

        //Print out all keys
        System.out.println(engKorDictionary.keySet());

        // Print out all values
        System.out.println(engKorDictionary.values());

        //Print out size
        System.out.println("The Size of our Dictionary is "+ engKorDictionary.size());

        System.out.println();
        System.out.println();

        //Shopping List
        Map<String,Boolean> shoppinglist = new HashMap<String,Boolean>();

        //Put some stuff in dictionary
        shoppinglist.put("Ham", true);
        shoppinglist.put("Bread",Boolean.TRUE);
        shoppinglist.put("Oreos",Boolean.TRUE);
        shoppinglist.put("Eggs", Boolean.FALSE);
        shoppinglist.put("Sugar", false);

        //Retrieve items
        System.out.println(shoppinglist.get("Ham"));
        System.out.println(shoppinglist.get("Sugar"));
        System.out.println(shoppinglist.get("Oreos"));

        //Key-Value Pairs Print Out
        System.out.println(shoppinglist.toString());
        //Is Empty?
        System.out.println(shoppinglist.isEmpty());

        //Remove things
        shoppinglist.remove("Eggs");
        System.out.println(shoppinglist.toString());

        //Replace values for a certain key
        shoppinglist.replace("Bread", Boolean.FALSE);
        System.out.println(shoppinglist.toString());

        //Clear out dictionary
        shoppinglist.clear();
        System.out.println(shoppinglist.toString());
        //Is Empty?
        System.out.println("empty check"+shoppinglist.isEmpty());
    }
}
