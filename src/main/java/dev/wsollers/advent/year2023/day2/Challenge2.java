package dev.wsollers.advent.year2023.day2;

import dev.wsollers.advent.AdventTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;

/**
 * Advent of Code 2023, Day 2, Challenge 2
 * https://adventofcode.com/2023/day/2
 * https://adventofcode.com/2023/day/2/input
 */

public class Challenge2 implements AdventTask {
  /**
   * process day 2 AOC 2023 challenge.
   *
   * @param argv command line arguments
   * @return true if successful
   */

  public boolean run(String [] argv) {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(
        Challenge2.class.getResourceAsStream("/data2Task1.txt")));
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
      br.close();
    } catch (Exception e) {
      if (br != null) {
        try {
          br.close();
        } catch (Exception e2) {
          System.err.println("Error: " + e2.getMessage());
        }
      }
      System.err.println("Error: " + e.getMessage());
    }
    return true;
  }
}
