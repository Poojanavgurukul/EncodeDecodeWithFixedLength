package EncodeDecodeTest;

import EncodeDecode.java.UniqueCharacter;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class Character {
    @Test public void itShouldHaveOnlyOneUniqueCharacter(){
      int expected=1;
      UniqueCharacter uniqueCharacter=new UniqueCharacter();
      assertEquals(expected,uniqueCharacter.getUniqueCharater("p").size());
    }
}
