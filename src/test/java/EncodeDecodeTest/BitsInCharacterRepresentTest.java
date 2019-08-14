package EncodeDecodeTest;

import EncodeDecode.java.BitsInCharacterRepresent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitsInCharacterRepresentTest {
    @Test public void numberOfBitsInWhichUniqueCharacterRepresent(){
        int expected =3;
        BitsInCharacterRepresent bitsInCharacterRepresent =new BitsInCharacterRepresent();
       assertEquals(expected,bitsInCharacterRepresent.getNumberOfBitsInUniqueCharacterRepresent(5));
    }
}
