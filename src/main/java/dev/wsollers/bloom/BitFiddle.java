package dev.wsollers.bloom;

public class BitFiddle {

  public boolean testBit(int valueUnderTest, int bitToTest) {
    if (bitToTest < 0 || bitToTest > 31) {
      throw new IllegalArgumentException("bitToTest must be between 0 and 31");
    }
    String binaryString = Integer.toBinaryString(valueUnderTest);
    int mask = 1 << bitToTest;
    boolean result = (mask & valueUnderTest) != 0;
    System.out.println(binaryString + ":" + valueUnderTest);
    return result;
  }

  boolean testBitVector(long valueUnderTest, long bitToTest) {
    long[] bitVector = new long[1000];
    if (bitToTest < 0 || bitToTest > 63) {
      throw new IllegalArgumentException("bitToTest must be between 0 and 63");
    }
    long bucketIndex = bitToTest / 64L;
    bitVector[(int) bucketIndex] = valueUnderTest;
    long bitIndex = bitToTest % 64L;
    long mask = 1L << bitToTest;
    boolean result = (mask & bitVector[(int) bucketIndex]) != 0;
    String binaryString = Long.toBinaryString(bitVector[(int) bucketIndex]);
    System.out.println(binaryString + ":" + valueUnderTest);
    return result;
  }
}
