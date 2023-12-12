package dev.wsollers.bloom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;


public class BitFiddleTests {

  @Test
  @DisplayName("Test Bit 0")
  public void testBit0() throws Exception {
    int valueUnderTest = 0b00000000_00000000_00000000_00000000;
    int bitToTest = 0;
    boolean result = new BitFiddle().testBit(valueUnderTest, bitToTest);
    System.out.println(result);
    assertFalse(result);
  }
  

  @Test
  @DisplayName("Test Bit 1")
  public void testBit1() throws Exception {
    int valueUnderTest = 0b00000000_00000000_00000000_00000010;
    int bitToTest = 1;
    boolean result = new BitFiddle().testBit(valueUnderTest, bitToTest);
    System.out.println(result);
    assertTrue(result);
  }
  
  @Test
  @DisplayName("Test Bit 31")
  public void testBit31() throws Exception {
    int valueUnderTest = 0xFFFFFFFF;
    int bitToTest = 31;
    boolean result = new BitFiddle().testBit(valueUnderTest, bitToTest);
    System.out.println(result);
    assertTrue(result);
  }
}
