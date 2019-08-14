package EncodeDecode.java;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new Reader();
        String userInput = "/Users/pooja/EncodedDecodeWithFixedLength/Input";
        System.out.println(reader.read(userInput));

        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        Set<Character> uniqueCharacters = uniqueCharacter.getUniqueCharacters("RAHUL");
        System.out.println(uniqueCharacters);

        BitsCounter bitsCounter = new BitsCounter();
        int bits = bitsCounter.getBits(uniqueCharacters.size());
        System.out.println(bits);

        BinaryTableInBits binaryTableInBits = new BinaryTableInBits();
        System.out.println(binaryTableInBits.generateBinaryTable(bits, uniqueCharacters));

        TableWriter tableWriter = new TableWriter();
        tableWriter.write(binaryTableInBits.generateBinaryTable(bits, uniqueCharacters));

        Encode encode=new Encode();
        Map<Character, String> table = binaryTableInBits.generateBinaryTable(bits, uniqueCharacter.getUniqueCharacters("RAHUL"));
        System.out.println(encode.encoder("RAHUL", table));
    }
}
