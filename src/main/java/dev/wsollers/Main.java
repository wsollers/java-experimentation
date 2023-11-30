package dev.wsollers;


class ExampleForDuncan {
   public 
      int amount = 1;

    public void setAmount(int amount) {
      System.out.println("Setting amount to " + amount);
    }
  }

class OtherExampleForDuncan  extends ExampleForDuncan { 
  public 
    int amount = 3;
  public void setAmount(int amount) {
    super.amount = 77;
    System.out.println("OtherExampleForDuncan this.amount " + this.amount);
    System.out.println("OtherExampleForDuncan amount " + this.amount);
    System.out.println("OtherExampleForDuncan amount " + super.amount);
  }
}

public class Main {

private static void testAutoUnboxingNPE(Boolean testNPE) {
 if(testNPE){
  System.out.println("I am true");
 } else if(testNPE){
  System.out.println("I am false");
 }
}
    public static void main(String[] args) {
      
      Boolean testNPE = false;
      int number = 0;
      Integer number2 = null;
      number = number2;
      System.out.println("Hello World!");
      testAutoUnboxingNPE(testNPE);
      testNPE = true;
      testAutoUnboxingNPE(testNPE);
      testNPE = null;
      testAutoUnboxingNPE(testNPE);
      ExampleForDuncan example = new ExampleForDuncan(); 
      example.amount = 2; 
      example.setAmount(4);
      System.out.println("Amount is " + example.amount);
      OtherExampleForDuncan otherExample = new OtherExampleForDuncan(); 
      System.out.println("Other Amount is " + otherExample.amount);
      otherExample.setAmount(7);
    }
}
