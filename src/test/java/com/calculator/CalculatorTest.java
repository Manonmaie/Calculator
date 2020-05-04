package com.calculator;
import org.junit.*;

public class CalculatorTest{
  private Calculator calculator;

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  public void addTest1() {
    int a = 20;
    int b = 30;
    int correctOutput = 50;
    long res = calculator.add(a, b);
    Assert.assertEquals(correctOutput, res);
  }

  @Test
  public void addTest2() {
    int a = 32;
    int b = 55;
    int correctOutput = 87;
    long res = calculator.add(a, b);
    Assert.assertEquals(correctOutput, res);
  }
}
