package EncodeDecode.java;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TableWriter {
    public void write(Map binaryTableOfParticularBits){
        ObjectMapper mapper=new ObjectMapper();
        ObjectWriter writer=mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("/Users/pooja/EncodedDecodeWithFixedLength/src/TableInBinaryWithUniqueCharacter.json"),
                    binaryTableOfParticularBits);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
