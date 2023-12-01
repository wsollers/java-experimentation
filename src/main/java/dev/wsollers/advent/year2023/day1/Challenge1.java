package dev.wsollers.advent.year2023.day1;

import dev.wsollers.advent.AdventTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Stream;

/**
 * Advent of Code 2023, Day 1, Challenge 1
 * https://adventofcode.com/2023/day/1
 * https://adventofcode.com/2023/day/1/input
 */
public class Challenge1 implements AdventTask {
  /**
   * Process a line of input.
   *
   * @param line The line to process.
   */
  private static Pattern p = Pattern.compile("\\d");
  private static String numbers = "one|two|three|four|five|six|seven|eight|nine";

  private static String reverseString(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  private static int getIntFromString (String intValue) {
    int result = 0;
    switch (intValue) {
      case "one":
        result = 1;
        break;
      case "two":
        result = 2;
        break;
      case "three":
        result = 3;
        break;
      case "four":
        result = 4;
        break;
      case "five":
        result = 5;
        break;
      case "six":
        result = 6;
        break;
      case "seven":
        result = 7;
        break;
      case "eight":
        result = 8;
        break;
      case "nine":
        result = 9;
        break;
      default:
        result = Integer.parseInt(intValue);
        break;
    }
    return result;
  }

  /**
   * Process a line of input.
   *
   * @param line The line to process.
   */

  public static int processLine(String line) {
    String regex = "\\d|"; 
    Pattern pnumbers = Pattern.compile(regex + numbers);
    String numbersReverse = reverseString(numbers);
    Pattern pnumbersReverse = Pattern.compile(regex + numbersReverse);

    System.out.println(line);
    int firstInt = 0;
    int lastInt = 0;
    Matcher m = pnumbers.matcher(line);
    if (m.find()) {
      System.out.println("Frontwards " + m.group());
      firstInt = getIntFromString(m.group());
    }
    String newLine = reverseString(line);
    m = pnumbersReverse.matcher(newLine);
    if (m.find()) {
      System.out.println("Backwards " + m.group());
      String temp = reverseString(m.group());
      System.out.println(temp);
      lastInt = getIntFromString(temp);
    }
    int asDigits = firstInt * 10 + lastInt;
    System.out.println(asDigits);
    return asDigits;
  }

  /**
   * Run the challenge.
   *
   * @param args Command line arguments.
   *
   * @return True if the challenge was successful.
   */

  public boolean run(String[] args) {
    BufferedReader in = null;
    try {
      System.out.println("Challenge1.run!");
      in = new BufferedReader(new InputStreamReader(
          //Challenge1.class.getResourceAsStream("/sampleData.txt")));
          Challenge1.class.getResourceAsStream("/data.txt")));
      String lines[] = in.lines().toArray(String[]::new);
      int sum = 0;
      for (String currentLine : lines) {
        //System.out.println("Old sum " + sum);
        sum = sum + processLine(currentLine);
        System.out.println("New sum " + sum);
      }
    } catch (Exception e) {
      System.out.println(e);
      System.exit(1);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (Exception e) {
          System.out.println(e);
        }
      }
    }
    return true;
  }
}
