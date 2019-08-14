package EncodeDecode.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BinaryTableOfParicularBits {
    public Map<Character,String>generateBinaryTableOfParicularBits(int bit, Set uniqueCharacters){
        Map<Character,String>table= new HashMap();
        int bin =0;
        for (Object world:uniqueCharacters) {
            char character= (char)world;
            String binaryNumber=Integer.toBinaryString(bin);
            StringBuilder fixedLength=new StringBuilder();
            for (int i = 0; i <bit-binaryNumber.length(); i++) {
                fixedLength.append("0");
            }
            fixedLength.append(binaryNumber);
            table.put(character,fixedLength.toString());
            bin+=1;
        }
        return table;
    }
}
