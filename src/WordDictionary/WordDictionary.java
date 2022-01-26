package WordDictionary;

import java.util.HashMap;

public class WordDictionary { 
    HashMap<String, String> dictionary = new HashMap<>();
    
    public void addWord(String english, String korean){
        dictionary.put(english, korean);
     }
     
    public String find(String english) {
    for (String key : dictionary.keySet()) {
        if (key.toLowerCase().equals(english.toLowerCase())) {
            return dictionary.get(key);
        }
    }

    return null;

}
}