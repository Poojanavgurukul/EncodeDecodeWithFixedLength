package EncodeDecode.java;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader= new Reader();
        String userInput="/Users/pooja/EncodedDecodeWithFixedLength/Input";
        System.out.println(reader.read(userInput));

        UniqueCharacter uniqueCharacter=new UniqueCharacter();
        System.out.println(uniqueCharacter.getUniqueCharater("RAHUL"));

        CharacterRepresentInParicularBits characterRepresentInParicularBits=new CharacterRepresentInParicularBits();
        int bits=characterRepresentInParicularBits.getNumberOfBitsInUniqueCharacterRepresent(uniqueCharacter.getUniqueCharater("RAHUL").size());
        System.out.println(bits);

        BinaryTableOfParicularBits binaryTableOfParicularBits=new BinaryTableOfParicularBits();
        System.out.println(binaryTableOfParicularBits.generateBinaryTableOfParicularBits(bits,uniqueCharacter.getUniqueCharater("RAHUL")));

        TableWriter tableWriter=new TableWriter();
        tableWriter.write(binaryTableOfParicularBits.generateBinaryTableOfParicularBits(bits,uniqueCharacter.getUniqueCharater("RAHUL")));

    }
}
