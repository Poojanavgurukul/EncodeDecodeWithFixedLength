package EncodeDecode.java;

import java.io.FileNotFoundException;
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

        BinaryTableInRequiredBits binaryTableInRequiredBits = new BinaryTableInRequiredBits();
        System.out.println(binaryTableInRequiredBits.generateBinaryTable(bits, uniqueCharacters));

        TableWriter tableWriter = new TableWriter();
        tableWriter.write(binaryTableInRequiredBits.generateBinaryTable(bits, uniqueCharacters));


    }
}
