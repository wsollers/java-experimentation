package dev.wsollers.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import dev.wsollers.bloom.BitFiddleTests;

@RunWith(Suite.class)
@SuiteClasses(
  {
    BitFiddleTests.class
  })
public class AllTests {

}
