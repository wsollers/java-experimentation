package dev.wsollers;

import dev.wsollers.advent.AdventTask;
//import dev.wsollers.advent.year2023.day1.Challenge1;
import dev.wsollers.advent.year2023.day2.Challenge2;
/**
 * Main class.
 */

public class Main {
  /**
   * Main method.
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    System.out.println("Hello World!");
    //AdventTask task = new Challenge1();
    AdventTask task = new Challenge2();
    task.run(args);
  }
}


