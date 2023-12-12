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
}
