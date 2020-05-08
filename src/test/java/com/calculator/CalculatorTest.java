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

  @Test
  public void subTest1() {
    int a = 30;
    int b = 20;
    int correctOutput = 10;
    long res = calculator.subtract(a, b);
    Assert.assertEquals(correctOutput, res);
  }

  @Test
  public void subTest2() {
    int a = 32;
    int b = 55;
    int correctOutput = -23;
    long res = calculator.subtract(a, b);
    Assert.assertEquals(correctOutput, res);
  }

  @Test
  public void mulTest1() {
    int a = 30;
    int b = 20;
    int correctOutput = 600;
    long res = calculator.multiplication(a, b);
    Assert.assertEquals(correctOutput, res);
  }

  @Test
  public void mulTest2() {
    int a = 5;
    int b = 10;
    int correctOutput = 50;
    long res = calculator.multiplication(a, b);
    Assert.assertEquals(correctOutput, res);
  }

  @Test
  public void divTest1() {
    int a = 30;
    int b = 20;
    int correctOutput = 1.5;
    long res = calculator.division(a, b);
    Assert.assertEquals(correctOutput, res);
  }

  @Test
  public void divTest2() {
    int a = 5;
    int b = 10;
    int correctOutput = 0.5;
    long res = calculator.division(a, b);
    Assert.assertEquals(correctOutput, res);
  }
}
