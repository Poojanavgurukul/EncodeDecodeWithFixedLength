package EncodeDecodeTest;

import EncodeDecode.java.UniqueCharacter;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Character {
    @Test public void itShouldHaveOnlyOneUniqueCharacter(){
      int expected=1;
      UniqueCharacter uniqueCharacter=new UniqueCharacter();
      assertEquals(expected,uniqueCharacter.getuniquecharater("p").size());
    }
    @Test public void itShouldHaveMultipleUniqueCharacter(){
        int expected=4;
        UniqueCharacter uniqueCharacter=new UniqueCharacter();
        assertEquals(expected,uniqueCharacter.getuniquecharater("POOJA").size());
    }
}
