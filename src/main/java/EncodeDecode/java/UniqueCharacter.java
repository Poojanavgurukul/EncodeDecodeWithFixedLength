package EncodeDecode.java;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
    public Set getUniqueCharater(String input){
        HashSet<Character> setOfUniqueCharacter=new HashSet<>();
        for (int i = 0; i <input.length() ; i++) {
            setOfUniqueCharacter.add(input.charAt(i));
        }
        return setOfUniqueCharacter;
    }
}
