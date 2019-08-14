package EncodeDecodeTest;

import EncodeDecode.java.BitsCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitsCounterTest {
    @Test public void numberOfBitsInWhichUniqueCharacterRepresent(){
        int expected =3;
        BitsCounter bitsCounter =new BitsCounter();
       assertEquals(expected, bitsCounter.getBits(5));
    }
}
