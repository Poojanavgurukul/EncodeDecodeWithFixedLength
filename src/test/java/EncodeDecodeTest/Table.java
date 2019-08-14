package EncodeDecodeTest;

import EncodeDecode.java.BinaryTableInRequiredBits;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Table {
    @Test public void itShouldGiveBinaryTableOfUniqueCharacterInParticularBits(){
        HashSet uniqueCharacters = new HashSet<>(Arrays.asList('r', 'a', 'h', 'u', 'l'));
        BinaryTableInRequiredBits binaryTableInRequiredBits =new BinaryTableInRequiredBits();
        Map<java.lang.Character, String> expected = new HashMap<>();
        expected.put('a', "000");
        expected.put('r', "001");
        expected.put('u', "010");
        expected.put('h', "011");
        expected.put('l', "100");
        assertEquals(expected, binaryTableInRequiredBits.generateBinaryTable(3, uniqueCharacters));
    }
}
