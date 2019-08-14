package EncodeDecode.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Encode {
    public List<Boolean> encoder(String input, Map<Character,String> table){
        List<Boolean> encodedData=new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char character=input.charAt(i);
            String encodedBitsReqiredForChar=table.get(character);
            String [] splits= encodedBitsReqiredForChar.split("");
            for (String split:splits) {
                if (split.equals("0")){
                    encodedData.add(false);
                }
                else{
                    encodedData.add(true);
                }
            }
        }
        
        return encodedData;
    }
}
