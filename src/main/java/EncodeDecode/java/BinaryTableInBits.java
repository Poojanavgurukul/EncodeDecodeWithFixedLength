package EncodeDecode.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unchecked")
public class BinaryTableInBits {
    public Map<Character, String> generateBinaryTable(int numberOfBitsRequired, Set<Character> uniqueCharacters) {
        Map<Character, String> table = new HashMap();
        int bin = 0;
        for (Character character : uniqueCharacters) {
            String binaryNumber = Integer.toBinaryString(bin);
            StringBuilder fixedLength = new StringBuilder();
            for (int i = 0; i < numberOfBitsRequired - binaryNumber.length(); i++) {
                fixedLength.append("0");
            }
            fixedLength.append(binaryNumber);
            table.put(character, fixedLength.toString());
            bin += 1;
        }
        return table;
    }
}
