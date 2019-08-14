package EncodeDecode.java;

public class BitsCounter {

    public int getBits(int uniqueElements) {
        for (int i = 0; i < uniqueElements; i++) {
            int pow = (int) Math.pow(2, i);
            if (uniqueElements < pow) {
                return i;
            }
        }
        return 0;
    }
}
