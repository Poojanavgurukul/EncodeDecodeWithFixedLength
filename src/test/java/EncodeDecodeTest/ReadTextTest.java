package EncodeDecodeTest;

import EncodeDecode.java.Reader;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class ReadTextTest {
        @Test public void itShouldReadInputFromFile() throws FileNotFoundException {
            String expected ="POOJA";
            Reader reader=new Reader();
            String actual= reader.read("/Users/pooja/EncodedDecodeWithFixedLength/Input");
            assertEquals(expected,actual);
        }
}
