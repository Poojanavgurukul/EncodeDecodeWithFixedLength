package EncodeDecodeTest;

import EncodeDecode.java.CharacterRepresentInParicularBits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterRepresentInParicularBitsTest {
    @Test public void numberOfBitsInWhichUniqueCharacterRepresent(){
        int expected =3;
        CharacterRepresentInParicularBits characterRepresentInParicularBits =new CharacterRepresentInParicularBits();
       assertEquals(expected, characterRepresentInParicularBits.getNumberOfBitsInUniqueCharacterRepresent(5));
    }
}
